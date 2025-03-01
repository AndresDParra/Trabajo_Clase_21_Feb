package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;

import java.io.File;
import java.nio.file.Path;

public class QR {

    // 1️⃣ Atributo estático privado para almacenar la única instancia
    private static QR instance;

    // 2️⃣ Constructor privado para evitar instancias múltiples
    private QR() {}

    // 3️⃣ Método público para obtener la única instancia
    public static QR getInstance() {
        if (instance == null) {
            instance = new QR();
        }
        return instance;
    }

    // 4️⃣ Método para generar código QR
    public void generarQR(String contenido, String rutaArchivo, int ancho, int alto) {
        try {
            BitMatrix matrix = new MultiFormatWriter().encode(contenido, BarcodeFormat.QR_CODE, ancho, alto);
            Path path = new File(rutaArchivo).toPath();
            MatrixToImageWriter.writeToPath(matrix, "PNG", path);
            System.out.println("✅ Código QR generado en: " + rutaArchivo);
        } catch (Exception e) {
            System.out.println("❌ Error al generar el código QR: " + e.getMessage());
        }
    }
}