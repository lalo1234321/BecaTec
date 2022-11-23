package com.dev.becatec.bd

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.DatabaseUtils
import android.database.sqlite.SQLiteDatabase
import com.dev.becatec.Becas


class BecaCrud(context:Context) {
    private var helper:DataBaseHelper? = null
    init {
        this.helper = DataBaseHelper(context)
    }

   fun newBeca(item:Becas) {


        //abrir conexión a base de datos en modo lectura
        val db: SQLiteDatabase = helper?.writableDatabase!!
        //mapea de columnas a insertar
        val values = ContentValues()
        values.put(BecaContract.Companion.Entrada.COLUMN_ID, item.id)
        values.put(BecaContract.Companion.Entrada.COLUMN_ING, item.ing)
        values.put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION,item.institucion)
        values.put(BecaContract.Companion.Entrada.COLUMN_DESC, item.desc)
        values.put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, item.requisitos)
        values.put(BecaContract.Companion.Entrada.COLUMN_IMAGE, item.image)
        values.put(BecaContract.Companion.Entrada.COLUMN_URL, item.url)
        values.put(BecaContract.Companion.Entrada.COLUMN_status, item.status)
        val newRow = db.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values)

        db.close()
    }
    val dab: SQLiteDatabase = helper?.writableDatabase!!
    fun insertarBecas(){

        val values0 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "General")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "Gobierno de Mexico")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA,"Beca Jovenes Escribiendo el Futuro" )
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "Busca fomentar que los jóvenes de escasos recursos de todo el país \n" +
                    "permanezcan y concluyan oportunamente sus estudios en el tipo superior, evitando \n" +
                    "así la deserción escolar")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Varios")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE,"https://becasenmexico.net/wp-content/uploads/2020/04/jovenes-escribiendo-el-futuro-1.jpg")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://www.gob.mx/becasbenitojuarez/articulos/convocatoria-2021-de-la-beca-jovenes-escribiendo-el-futuro")
            put(BecaContract.Companion.Entrada.COLUMN_status,"Inactive")
        }
        val values1 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "General")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "Gobierno de Mexico")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "Beca para el Bienestar Benito Juarez de Educacion Superior")
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "Compatible con la Beca de Excelencia, \n" +
                    "Beca para Movilidad Nacional, Beca para Servicio Social, Beca para Titulación, \n" +
                    "Beca para Prácticas Profesionales y Beca para Capacitación,")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Varios")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE,"https://www.uv.mx/fei/files/2020/11/Captura-de-pantalla-2020-11-27-a-las-13.21.20.png")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://www.gob.mx/becasbenitojuarez/articulos/convocatoria-2021-de-la-beca-jovenes-escribiendo-el-futuro")
            put(BecaContract.Companion.Entrada.COLUMN_status,"Active")
        }
        val values5 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "General")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "Gobierno de Mexico")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "Beca Edomex Licenciatura Educativa 2022")
            put(BecaContract.Companion.Entrada.COLUMN_DESC,"A las y los estudiantes inscritos en alguna de las Escuelas Normales, Escuelas Normales Superiores y las Unidades de la Unidad pedadogica Nacional del Sistema educativo estatal en el estado de Mexico," +
                    "a participar en el programa de desarrollo social Becas Familias Fuertes por la Educacion para la licenciatura Educativa promocion 2022-2023")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Varios")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE,"https://becas.top/wp-content/uploads/2022/02/programa-de-becas-edomex-licenciatura-educativa-2022-2023-1200x630.webp?ezimgfmt=rs%3Adevice%2Frscb1-1")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://seduc.edomex.gob.mx/sites/seduc.edomex.gob.mx/files/files/becas/licenciatura-educativa/Lic_educativa2022_ok01.pdf")
            put(BecaContract.Companion.Entrada.COLUMN_status,"Active")
        }
        val values6 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "General")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "techMexico")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "BECA SOCIOECONÓMICA")
            put(BecaContract.Companion.Entrada.COLUMN_DESC,"Si te interesa estudiar con nosotros pero tus ingresos (o los de tus tutores) no te dan la posibilidad de cubrir el costo del programa, puedes aplicar para esta beca. Deberás adjuntar tu identificación oficial, certificado oficial final de tus estudios inmediatos anteriores y los documentos que comprueben los ingresos de quien pagaría la matrícula, puede ser declaración anual de impuestos o comprobantes de ingresos del último mes.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Varios")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE,"https://www.ific.es/blog/wp-content/uploads/2019/10/Logo-Tech.png")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://www.techtitute.com/mx/becas?gclid=Cj0KCQiAmaibBhCAARIsAKUlaKSVYEkzW6ICDAllMjmn9r6q-ObiW4GN4juqgSYZkWvgPHKwYOKnmQkaAugyEALw_wcB")
            put(BecaContract.Companion.Entrada.COLUMN_status,"Active")
        }
        val values7 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "General")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "techMexico")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "BECA DE RENDIMIENTO ACADÉMICO")
            put(BecaContract.Companion.Entrada.COLUMN_DESC,"Podrás solicitarla si el promedio final de tus estudios inmediatos anteriores fue superior a 9 (nueve), deberás agregar, además de alguna identificación oficial, el certificado oficial final de esos estudios, donde se detallen las materias cursadas y las calificaciones obtenidas. El criterio de selección será el promedio más alto.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Varios")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE,"https://www.ific.es/blog/wp-content/uploads/2019/10/Logo-Tech.png")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://www.techtitute.com/mx/becas?gclid=Cj0KCQiAmaibBhCAARIsAKUlaKSVYEkzW6ICDAllMjmn9r6q-ObiW4GN4juqgSYZkWvgPHKwYOKnmQkaAugyEALw_wcB")
            put(BecaContract.Companion.Entrada.COLUMN_status,"Active")
        }


        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values0)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values1)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values5)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values6)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values7)

        dab.close()
    }
    fun checkEmpty(): Boolean {
        val tabla :String = BecaContract.Companion.Entrada.TABLE_NAME
        return DatabaseUtils.queryNumEntries(dab, tabla) == 0L//longitud cero
    }
    fun getBecas():ArrayList<Becas> {
        var items:ArrayList<Becas> = ArrayList()
        val db:SQLiteDatabase = helper?.readableDatabase!!

        //Especificar columnas que quiero extraer
        val columnas = arrayOf<String>(
            BecaContract.Companion.Entrada.COLUMN_ID,
            BecaContract.Companion.Entrada.COLUMN_ING,
            BecaContract.Companion.Entrada.COLUMN_INSTITUCION,
            BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA,
            BecaContract.Companion.Entrada.COLUMN_DESC,
            BecaContract.Companion.Entrada.COLUMN_REQUISITOS,
            BecaContract.Companion.Entrada.COLUMN_URL,
            BecaContract.Companion.Entrada.COLUMN_IMAGE,
            BecaContract.Companion.Entrada.COLUMN_status
        )

        //Crear cursor para recorrer la tabla
        val c: Cursor = db.query(
            BecaContract.Companion.Entrada.TABLE_NAME,
            columnas,
            null,
            null,
            null,
            null,
            null
        )

        //Realizar recorrido del cursor en la tabla
        while( c.moveToNext() ) {
            items.add( Becas(
                c.getInt(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_ID)),
                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_ING)),
                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_INSTITUCION)),
                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA)),
                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_DESC)),
                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_REQUISITOS)),
                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_IMAGE)),
                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_status)),
                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_URL))
            ))

        }

        //Cerrar conexión
        db.close()
        return items
    }
}