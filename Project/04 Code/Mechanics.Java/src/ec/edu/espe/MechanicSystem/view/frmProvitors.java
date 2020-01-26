package ec.edu.espe.MechanicSystem.view;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

public class frmProvitors extends javax.swing.JFrame {

    DefaultTableModel modelo;
    private final String ruta = System.getProperties().getProperty("user.dir");

    public frmProvitors() {
        
        initComponents();
        ListaElementosProvitorsBD();
    }

    private void CargarProvitors() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(ruta + "//provitors.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            DefaultListModel model_lista = new DefaultListModel();
            DefaultTableModel model_tabla = new DefaultTableModel();
            model_tabla.addColumn("PROVITORS");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                jComboBox1.addItem(linea);
                model_lista.addElement(linea);
                model_tabla.addRow(new String[]{linea});
            }
            jList1.setModel(model_lista);
            jTable1.setModel(model_tabla);
        } catch (IOException e) {
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e2) {
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Provitors DBMongo"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("New Provitor:");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Provitors", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            jTable3.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jButton1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model;
        model = new DefaultTableModel();
        model.addColumn("Provitors");
        this.jTable1.setModel(model);

        String info[] = new String[3];
        info[0] = jTextField1.getText();
        model.addRow(info);

        // String datos = jTextField1.getText();
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("provitors.txt", true);
            pw = new PrintWriter(fw);
            String provitor = jTextField1.getText();

            pw.println("{'Provitor' :" + provitor + "}");
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(frmRegister.class.getName()).log(Level.SEVERE, null, ex);
        }

        Gson gson = new Gson();

        DefaultTableModel modelo;
        modelo = new DefaultTableModel();
        modelo.addColumn("Provitor");
        this.jTable3.setModel(modelo);
        String[] Datos = new String[5];
        Datos[0] = jTextField1.getText();
        modelo.addRow(Datos);
        CargarProvitors();
        CrearProvitorMongo();
        jTextField1.setText(" ");

    }//GEN-LAST:event_jButton1ActionPerformed
    private void CrearProvitorMongo() {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona(jTextField1.getText().toString()));
        //personas.add(new Persona(jTextField1.getText().toString(), jTextField1.getText().toString(), parseInt(jTextField3.getText().toString()), new ArrayList<String>(Arrays.asList("Administrador")), false));

        try {
            // PASO 1: Conexión al Server de MongoDB Pasandole el host y el puerto
            MongoClient mongoClient = new MongoClient("localhost", 27017);

            // PASO 2: Conexión a la base de datos
            DB db = mongoClient.getDB("Mechanics");

            // PASO 3: Obtenemos una coleccion para trabajar con ella
            DBCollection collection = db.getCollection("Provitors");

            // PASO 4: CRUD (Create-Read-Update-Delete)
            // PASO 4.1: "CREATE" -> Metemos los objetos Nombre Persona (o documentos en Mongo) en la coleccion Personas
            for (Persona pers : personas) {
                collection.insert(pers.toDBObjectProvitors());
            }

            // PASO 4.2.1: "READ" -> Leemos todos los documentos de la base de datos
            int numDocumentos = (int) collection.getCount();
            System.out.println("Número de documentos en la colección : " + numDocumentos + "\n");

            // Busco todos los documentos de la colección y los imprimo
            DBCursor cursor = collection.find();
            try {
                while (cursor.hasNext()) {
                    System.out.println(cursor.next().toString());
                }
            } finally {
                cursor.close();
            }

            // PASO 4.2.2: "READ" -> Hacemos una Query con condiciones (Buscar Futbolistas que sean delanteros) y lo pasamos a un objeto Java
            System.out.println("\nProvitors que estan en estado activo");
            DBObject query = new BasicDBObject("provitor", new BasicDBObject("$regex", "provitor")); // busqueda por Administrador o Operaciones
            cursor = collection.find(query);
            DefaultListModel modeloLista = new DefaultListModel();

            try {
                while (cursor.hasNext()) {
                    Persona persona = new Persona((BasicDBObject) cursor.next());
                    modeloLista.addElement(persona.toString());
                }
            } finally {
                cursor.close();
            }

            // PASO FINAL: Cerrar la conexion
            mongoClient.close();

        } catch (UnknownHostException ex) {
            System.out.println("Exception al conectar al server de Mongo: " + ex.getMessage());
        }
        ListaElementosProvitorsBD();
    }

    private void ListaElementosProvitorsBD() {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        try {
            // PASO 1: Conexión al Server de MongoDB Pasandole el host y el puerto
            MongoClient mongoClient = new MongoClient("localhost", 27017);

            // PASO 2: Conexión a la base de datos
            DB db = mongoClient.getDB("Mechanics");

            // PASO 3: Obtenemos una coleccion para trabajar con ella
            DBCollection collection = db.getCollection("Provitors");

            // PASO 4: CRUD (Create-Read-Update-Delete)
            // PASO 4.2.1: "READ" -> Leemos todos los documentos de la base de datos
            int numDocumentos = (int) collection.getCount();

            // Busco todos los documentos de la colección y los imprimo
            DBCursor cursor = collection.find();

            DefaultListModel modeloLista = new DefaultListModel();
            DefaultTableModel model;
            model = new DefaultTableModel();
            model.addColumn("Provitors");
            this.jTable1.setModel(model);

            String info[] = new String[3];
            
            try {
                while (cursor.hasNext()) {
                    info[0] = cursor.next().toString();
                    model.addRow(info);
                    jTable1.setModel(model);
                }
            } finally {
                cursor.close();
            }

        } catch (UnknownHostException ex) {
            System.out.println("Exception al conectar al server de Mongo: " + ex.getMessage());
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmProvitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProvitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProvitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProvitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProvitors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
