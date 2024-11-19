package pspex;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author 2dam
 */
class Cliente {

    private static final String HOST = "localhost";
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(HOST, PORT); //fichero de propiedades

                ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream input = new ObjectInputStream(socket.getInputStream())) {

            System.out.println("Ingrese la temperatura en grados Celsius: ");
            // String degrees = reader.readLine();
            // degrees.to
            while (true) {

                //Scanner kb = Scanner.;
                float valor = 33;
                // valor = degrees;

                Temperatura temperatura = new Temperatura(valor);
                output.writeObject(temperatura);
                output.flush();

                String response = (String) input.readObject();
                System.out.println(valor + " ºC convertido a ºF son " + response);
            }

        } catch (IOException | ClassNotFoundException e) {
        }
    }
}
