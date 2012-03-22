package org.kodejava.example.util.zip;

import java.io.FileOutputStream;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class ZipObjectDemo {
    public static void main(String[] args) {
        User admin = new User();
        admin.setId(1l);
        admin.setUsername("admin");
        admin.setPassword("secret");
        admin.setFirstName("System");
        admin.setLastName("Administrator");

        User foo = new User();
        foo.setId(2l);
        foo.setUsername("foo");
        foo.setPassword("secret");
        foo.setFirstName("Foo");
        foo.setLastName("Bar");

        System.out.println("Zipping....");
        System.out.println(admin);
        System.out.println(foo);
        try {
            FileOutputStream fos = new FileOutputStream(new File("user.dat"));
            GZIPOutputStream gos = new GZIPOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(gos);

            oos.writeObject(admin);
            oos.writeObject(foo);

            oos.flush();
            oos.close();

            gos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}