package behavioral.command.demo3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class FileUtile {
	public static void writeCommands(ArrayList commands) {
		try {
			FileOutputStream file = new FileOutputStream("src/behavioral/command/demo3/config.log");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(file));
			objectOutputStream.writeObject(commands);
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList readCommands() {
		try {
			FileInputStream file = new FileInputStream("src/behavioral/command/demo3/config.log");
			ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(file));
			ArrayList commands = (ArrayList) objectInputStream.readObject();
			objectInputStream.close();
			// Collections.reverse(commands);
			return commands;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
