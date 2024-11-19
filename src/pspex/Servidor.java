package pspex;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author 2dam
 */
public class Servidor {

}

class Server {

    private static final int PORT = 12345; //fichero de propiedadess

    public static void main(String[] args) throws IOException {

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Esperando conexiones de clientes");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("¡Cliente conectado!");

                new Thread(new Hilo(clientSocket)).start();

            }
        }
    }
}