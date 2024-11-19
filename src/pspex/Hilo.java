package pspex;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


/**
 *
 * @author 2dam
 */
public class Hilo implements Runnable {

    private final Socket socket;

    public Hilo(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream())) {

            Float valor;
            Temperatura temperatura;
            while ((temperatura = (Temperatura) input.readObject()) != null) {
                valor = temperatura.getValor();
                valor = (valor * 9 / 5) + 32;

                output.flush();
            }
        } catch (IOException | ClassNotFoundException ex) {

        }
    }
}
