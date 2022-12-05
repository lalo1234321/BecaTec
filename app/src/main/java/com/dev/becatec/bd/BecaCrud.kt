package com.dev.becatec.bd

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.DatabaseUtils
import android.database.sqlite.SQLiteDatabase
import com.dev.becatec.Becas


class BecaCrud(context:Context) {
    private var helper:DataBaseHelper? = null
    var f1: String=""
    var f2: String= ""

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
        values.put(BecaContract.Companion.Entrada.COLUMN_TIPO, item.tipo)
        val newRow = db.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values)

        db.close()
    }
    val dab: SQLiteDatabase = helper?.writableDatabase!!
    fun insertarBecas(){

        val values0 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "Electronica") //General
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "Gobierno de Mexico")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA,"Beca Jovenes Escribiendo el Futuro" )
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "Busca fomentar que los jóvenes de escasos recursos de todo el país \n" +
                    "permanezcan y concluyan oportunamente sus estudios en el tipo superior, evitando \n" +
                    "así la deserción escolar")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Educación Superior (IPES) del país, de las señaladas en el primer párrafo de esta Convocatoria.\n" +
                    "2. Tener hasta 29 años cumplidos al 31 de diciembre 2020, exceptuando estudiantes de IPES prioritarias señaladas en las Reglas de Operación 2021 del Programa" +
                    "3. Tener un ingreso estimado mensual per cápita menor a la LPI (Límite de Pobreza por Ingresos) en función del estrato rural/urbano de su localidad de residencia, exceptuando a los estudiantes inscritos en escuelas prioritarias y a las y los \n" +
                    "becarios del Programa en el semestre inmediato anterior de cualquier escuela.\n" +
                    "4. No recibir, de manera simultánea, otra beca para el mismo fin otorgada por alguna dependencia o entidad de la Administración Pública Federal (APF).\n" +
                    "5. Postularse como aspirante a través del registro de su solicitud de beca en el Sistema Único de Beneficiarios de Educación Superior (SUBES) en la página:\n" +
                    "https://subes.becasbenitojuarez.gob.mx. ")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE,"https://becasenmexico.net/wp-content/uploads/2020/04/jovenes-escribiendo-el-futuro-1.jpg")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://www.gob.mx/becasbenitojuarez/articulos/convocatoria-2021-de-la-beca-jovenes-escribiendo-el-futuro")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO,"Estudios")
        }
        val values1 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "Mecatronica")//general
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "Gobierno de México")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "Beca para el Bienestar Benito Juárez de Educación Superior: jóvenes escribiendo el futuro")
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "La Beca para el Bienestar Benito Juárez de Educación Superior es un programa del Gobierno de México dirigido a las y los estudiantes de licenciatura o técnico superior universitario que están inscritos en alguna de las universidades prioritarias a las que brindamos atención.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Ser alumna o alumno de licenciatura o técnico superior universitario inscrita o inscrito en alguna de las universidades prioritarias a las que brindamos atención.\n"+
                   "No debes recibir otra beca con el mismo fin otorgada por programas federales.")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE, "https://www.gob.mx/cms/uploads/image/file/524757/Eduaci_n_Beca_Educaci_n_Superior.jpg")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://www.gob.mx/becasbenitojuarez/articulos/beca-jovenes-escribiendo-el-futuro-de-educacion-superior")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO, "Estudios")
        }
        val values2 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "Quimica")//general
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "Gobierno de México")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "Becas Elisa Acuña")
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "Este conjunto de becas se otorgan tanto a estudiantes que cursan sus estudios superiores, como a aquellos que los concluyeron recientemente.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Dirigida a estudiantes inscritos en una Institución Pública de Educación Superior, provenientes de hogares cuyo ingreso sea igual o menor a la Línea de Bienestar vigente al momento de solicitar la beca.\n"+
                    "Hijas/os de militares de las Fuerzas Armadas Mexicanas, en General, en situación de retiro, fallecidos en combate o incapacitados en 1a. o 2a. categoría en actos de servicio o a consecuencia de estos.")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE, "https://www.gob.mx/cms/uploads/image/file/553739/ELISAINTERIOR.jpg")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://www.gob.mx/becasbenitojuarez/articulos/becas-elisa-acuna/")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO, "Apoyo Economico")
        }
        val values3 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "Gestion Empresarial")//general
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "Gobierno de México")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "Becas Elisa Acuña")
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "Este conjunto de becas se otorgan tanto a estudiantes que cursan sus estudios superiores, como a aquellos que los concluyeron recientemente.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Estudiantes inscritos en alguna Institución Pública de Educación Superior que hayan obtenido durante el período o tipo educativo inmediato anterior un desempeño académico sobresaliente o con una trayectoria regular sobresaliente.\n"+
                    "Haber obtenido algún reconocimiento académico otorgado por instituciones públicas o privadas, nacionales o extranjeras, como consecuencia de su desempeño académico, participación en algún concurso o evento similar en los ámbitos académico, científico y/o de la investigación, o haber sido propuesto por asociaciones o instituciones de reconocido prestigio en los ámbitos académico, científico y/o de la investigación con quienes se haya celebrado instrumentos jurídicos.")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE, "https://www.gob.mx/cms/uploads/image/file/553739/ELISAINTERIOR.jpg")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://www.gob.mx/becasbenitojuarez/articulos/becas-elisa-acuna/")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO, "Estudios")
        }
        val values4 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "Industrial")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "Gobierno de México")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "Becas Elisa Acuña")
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "Este conjunto de becas se otorgan tanto a estudiantes que cursan sus estudios superiores, como a aquellos que los concluyeron recientemente.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Para estudiantes de licenciatura o Técnico Superior inscritos en una Institución Pública de Educación Superior, o egresados con no más de un año de haber concluido el plan de estudios, que se encuentren inscritos en un programa de servicio social reconocido por la institución en la que realizan sus estudios.")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE, "https://www.gob.mx/cms/uploads/image/file/553739/ELISAINTERIOR.jpg")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://www.gob.mx/becasbenitojuarez/articulos/becas-elisa-acuna/")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO, "Manutencion")
        }

        val values5 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "General")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "techMexico")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "BECA SOCIOECONÓMICA")
            put(BecaContract.Companion.Entrada.COLUMN_DESC,"Si te interesa estudiar con nosotros pero tus ingresos (o los de tus tutores) no te dan la posibilidad de cubrir el costo del programa, puedes aplicar para esta beca. Deberás adjuntar tu identificación oficial, certificado oficial final de tus estudios inmediatos anteriores y los documentos que comprueben los ingresos de quien pagaría la matrícula, puede ser declaración anual de impuestos o comprobantes de ingresos del último mes.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Deberás adjuntar tu identificación oficial, certificado oficial final de tus estudios inmediatos anteriores y los documentos que comprueben los ingresos de quien pagaría la matrícula, puede ser declaración anual de impuestos o comprobantes de ingresos del último mes.")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE,"https://www.ific.es/blog/wp-content/uploads/2019/10/Logo-Tech.png")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://www.techtitute.com/mx/becas?gclid=Cj0KCQiAmaibBhCAARIsAKUlaKSVYEkzW6ICDAllMjmn9r6q-ObiW4GN4juqgSYZkWvgPHKwYOKnmQkaAugyEALw_wcB")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO,"Manutencion")
        }
        val values6 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "Sistemas Computacionales")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "techMexico")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "BECA DE RENDIMIENTO ACADÉMICO")
            put(BecaContract.Companion.Entrada.COLUMN_DESC,"Podrás solicitarla si el promedio final de tus estudios inmediatos anteriores fue superior a 9 (nueve), deberás agregar, además de alguna identificación oficial, el certificado oficial final de esos estudios, donde se detallen las materias cursadas y las calificaciones obtenidas. El criterio de selección será el promedio más alto.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Podrás solicitarla si el promedio final de tus estudios inmediatos anteriores fue superior a 9 (nueve), deberás agregar, además de alguna identificación oficial, el certificado oficial final de esos estudios, donde se detallen las materias cursadas y las calificaciones obtenidas. El criterio de selección será el promedio más alto.")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE,"https://www.ific.es/blog/wp-content/uploads/2019/10/Logo-Tech.png")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://www.techtitute.com/mx/becas?gclid=Cj0KCQiAmaibBhCAARIsAKUlaKSVYEkzW6ICDAllMjmn9r6q-ObiW4GN4juqgSYZkWvgPHKwYOKnmQkaAugyEALw_wcB")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO,"Egreso/Tesis")
        }
        val values7 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "General")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "Gobierno de México")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "Becas Elisa Acuña")
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "Este conjunto de becas se otorgan tanto a estudiantes que cursan sus estudios superiores, como a aquellos que los concluyeron recientemente.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Estudiantes de una Institución Pública de Educación Superior que hayan concluido o estén por concluir sus estudios de educación superior y que deban realizar su tesis para obtener el grado correspondiente. Pueden participar egresados hasta con un año de antigüedad y mujeres que concluyeron su carrera, pero suspendieron su proceso de titulación por causa del embarazo y cuidados maternos posteriores al parto, en un periodo no mayor a dos años.")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE, "https://www.gob.mx/cms/uploads/image/file/553739/ELISAINTERIOR.jpg")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://www.gob.mx/becasbenitojuarez/articulos/becas-elisa-acuna/")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO, "Egreso/Tesis")
        }
        val values8 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "General")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "Gobierno de México")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "Becas Elisa Acuña")
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "Este conjunto de becas se otorgan tanto a estudiantes que cursan sus estudios superiores, como a aquellos que los concluyeron recientemente.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Estudiantes de una Institución Pública de Educación Superior que se encuentren inscritos en un programa de movilidad dentro de la República Mexicana, impulsado, avalado o reconocido por la Institución, con el objeto de que puedan realizar sus estudios por periodos de hasta un año.\n"+
                    "Para estudiantes regulares inscritos en una Institución Pública de Educación Superior, que deseen realizar estudios parciales o complementarios de licenciatura, TSU o estancias de capacitación e investigación en programas de movilidad, en una institución de educación superior extranjera con las que se tenga formalizado un convenio de colaboración.")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE, "https://www.gob.mx/cms/uploads/image/file/553739/ELISAINTERIOR.jpg")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://www.gob.mx/becasbenitojuarez/articulos/becas-elisa-acuna/")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO, "Movilidad")
        }

        val values9 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "General")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "Gobierno de México")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "Becas Elisa Acuña")
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "Este conjunto de becas se otorgan tanto a estudiantes que cursan sus estudios superiores, como a aquellos que los concluyeron recientemente.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Estudiantes, docentes y egresados de una Institución Pública de Educación Superior, propuestos por su escuela, asociaciones o instituciones con las cuales la SEP haya celebrado convenios, a fin de que realicen actividades, talleres, congresos, cursos o diplomados, por un periodo no mayor a dos años, encaminados a su formación continua y que respondan a las necesidades del país.")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE, "https://www.gob.mx/cms/uploads/image/file/553739/ELISAINTERIOR.jpg")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://www.gob.mx/becasbenitojuarez/articulos/becas-elisa-acuna/")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO, "Egreso/Tesis")
        }
        val values10 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "General")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "Gobierno de México")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "Becas Elisa Acuña")
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "Este conjunto de becas se otorgan tanto a estudiantes que cursan sus estudios superiores, como a aquellos que los concluyeron recientemente.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Dirigida a estudiantes, docentes y personal con funciones de dirección de alguna Institución Pública de Educación Superior identificados/as como parte de un programa implementado, ya sea por el Ejecutivo Federal, a través de la SEP o en coordinación con las dependencias, organismos gubernamentales y/o las entidades federativas, para la atención de contingencias o programas priorizados por el Gobierno de México a nivel nacional o regional.")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE, "https://www.gob.mx/cms/uploads/image/file/553739/ELISAINTERIOR.jpg")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://www.gob.mx/becasbenitojuarez/articulos/becas-elisa-acuna/")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO, "Egreso/Tesis")
        }

        val values11 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "General")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "CONACYT")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "Fortalecimiento Académico para Indígenas")
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "Conjuntar esfuerzos, acciones y recursos para promover, difundir y fomentar en mexicanos de origen indígena la continuación de su formación por medio de estudios de posgrados, a través de convocatorias específicas, así como acceder a los apoyos complementarios para quienes ya cuentan con una beca CONACYT.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Ser Becaria CONACYT vigente y alumna regular dentro del programa de posgrado.\n"+
                    "Presentar documentación que la acredite como originaria de un pueblo indígena.\n"+
                    "Presentar solicitud en que especifique el tipo de apoyo (os) a que se está postulando en el Formato de solicitud de apoyo.")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE, "https://conacyt.mx/wp-content/uploads/2021/10/logo_conacyt_con_sintagma_azul_completo.svg")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://conacyt.mx/becas_posgrados/fortalecimiento-academico-para-indigenas/")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO, "Apoyo Economico")
        }

        val values12 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "TICS")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "CONACYT")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "Apoyos complementarios de maternidad y paternidad 2022")
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "Convoca a personas becarias del programa de becas para el fortalecimiento de la comunidad de humanidades, ciencias, tecnologías e innovación del Conacyt que sean madres, padres o tutores de hijas o hijos durante el periodo de vigencia de la beca.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Copia del acta de nacimiento de cada hija o hijo o clave única de registro de población de cada hijo o hija nacido durante el 2022.\n"+
                   "Contar con una beca o apoyo vigente durante el año fiscal 2022.\n"+
            "Completar y enviar la solicitud de beca conforme a la Guía para la postulación de Apoyos complementarios de maternidad y paternidad 2022.")
             put(BecaContract.Companion.Entrada.COLUMN_IMAGE, "https://conacyt.mx/wp-content/uploads/2021/10/logo_conacyt_con_sintagma_azul_completo.svg")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://conacyt.mx/convocatorias/convocatorias-becas-nacionales/convocatoria-apoyos-complementarios-de-maternidad-y-paternidad-2022/")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO, "Manutencion")
        }


        val values13 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "Logistica")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "Gobierno de México")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "Ciencia EDOMÉX")
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "La Beca Ciencia EDOMÉX, tiene como finalidad contribuir al mejoramiento socioeconómico mediante un apoyo monetario que consolide la formación y desarrollo profesional de las y los estudiantes que cursan algún periodo correspondiente a los primeros dos años de sus estudios de licenciatura en instituciones públicas de educación superior.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Ser residente del Estado de México.\n"+
                    "Ser menor de 25 años.\n"+
                    "Estar cursando estudios escolarizados de licenciatura en una institución pública de educación superior (primeros dos años del programa de estudios).\n"+
                    "Tener promedio mínimo de 8.0 y ser alumno regular (no adeudo de materias).")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE, "https://comecyt.edomex.gob.mx/sites/comecyt.edomex.gob.mx/files/files/Licenciatura/BANNERS-02%20(1).jpg")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://comecyt.edomex.gob.mx/ciencias-edmex")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO, "Apoyo Economico")
        }

        val values14= ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "General")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "Gobierno de México")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "Estudiantes Mexiquenses en el Extranjero")
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "Apoyo monetario a las y los estudiantes originarios del Estado de México que se encuentren realizando estudios superiores en el extranjero, con la finalidad de que compartan sus conocimientos a través de un seminario o taller virtual dirigido a estudiantes de instituciones educativas de esta entidad.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Ser estudiante originario del Estado de México que se encuentre realizando estudios superiores en el extranjero, con la finalidad de que compartan sus conocimientos a través de un seminario o taller dirigido a estudiantes de instituciones públicas de nivel superior.")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE, "https://comecyt.edomex.gob.mx/sites/comecyt.edomex.gob.mx/files/images/BANNER-MICROSITIO%20EXTRANJERO%20940_220-22-01%20(1)_0.png")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://comecyt.edomex.gob.mx/node/218")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO, "Movilidad")
        }

        val values15 = ContentValues().apply {
            put(BecaContract.Companion.Entrada.COLUMN_ING, "General")
            put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION, "Gobierno de México")
            put(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA, "Apoyo a Estudiantes Destacados")
            put(BecaContract.Companion.Entrada.COLUMN_DESC, "Apoyo monetario para participar de manera presencial en eventos o concursos científicos o tecnológicos, estatales, nacionales o internacionales.\n"+
                    "Para el caso de los proyectos desarrollados en equipo que deseen participar de manera presencial en un concurso (olimpiada, feria, torneo o competencia) el apoyo será otorgado a máximo 5 integrantes por equipo, mismos que deberán acreditar la colaboración mediante documento oficial.")
            put(BecaContract.Companion.Entrada.COLUMN_REQUISITOS, "Ser estudiantes inscritos en instituciones públicas o privadas de nivel básico, medio superior, superior o posgrado de esta entidad, para que participen de manera presencial en eventos o concursos científicos o tecnológicos, estatales, nacionales o internacionales, dando a conocer a través de una ponencia, cartel o trabajo en extenso, los resultados de su proyecto de investigación científica o desarrollo tecnológico.\n"+
                    "Podrán participar estudiantes, profesores e investigadores que presenten proyectos orientados a las siguientes áreas estratégicas:\n"+
                    "Química, Agroalimentaria, Salud, Automotriz, Desarrollo de nuevos materiales y tecnología de plásticos, Desarrollo sustentable, Tecnologías de la información, Ciencias sociales y humanidades.")
            put(BecaContract.Companion.Entrada.COLUMN_IMAGE, "https://dgsei.edomex.gob.mx/sites/dgsei.edomex.gob.mx/files/h1.png")
            put(BecaContract.Companion.Entrada.COLUMN_URL, "https://comecyt.edomex.gob.mx/node/325")
            put(BecaContract.Companion.Entrada.COLUMN_TIPO, "Estudios")
        }


        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values0)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values1)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values2)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values3)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values4)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values5)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values6)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values7)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values8)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values9)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values10)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values11)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values12)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values13)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values14)
        dab?.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values15)


        dab.close()
    }
    fun checkEmpty(): Boolean {
        val tabla :String = BecaContract.Companion.Entrada.TABLE_NAME
        return DatabaseUtils.queryNumEntries(dab, tabla) == 0L//longitud cero
    }
    fun getParameters(t1: String?, t2:String?){
        this.f1=t1.toString()
        this.f2=t2.toString()
    }

    fun getBecas():ArrayList<Becas> {
        println(f1+" f11_________________f22 "+ f2)
        val items:ArrayList<Becas> = ArrayList()
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
            BecaContract.Companion.Entrada.COLUMN_TIPO
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
        if(f1!="Ingenierias"&&f2!="Becas"){
            while( c.moveToNext() )  {
                if (c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_ING))==f1 && c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_TIPO))==f2) {
                    items.add(
                        Becas(
                            c.getInt(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_ID)),
                            c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_ING)),
                            c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_INSTITUCION)),
                            c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA)),
                            c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_DESC)),
                            c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_REQUISITOS)),
                            c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_IMAGE)),
                            c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_TIPO)),
                            c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_URL))
                        )
                    )
                }
            }
            f1=""
            f2=""
        }else{
            if(f1=="Ingenierias"&&f2!="Becas"){
                while( c.moveToNext() )  {
                    if (c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_TIPO))==f2) {
                        items.add(
                            Becas(
                                c.getInt(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_ID)),
                                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_ING)),
                                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_INSTITUCION)),
                                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA)),
                                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_DESC)),
                                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_REQUISITOS)),
                                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_IMAGE)),
                                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_TIPO)),
                                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_URL))
                            )
                        )
                    }
                }
                f1=""
                f2=""
            }else {
                if(f1!="Ingenierias"&&f2=="Becas"){
                    while (c.moveToNext()) {
                        if (c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_ING)) == f1 || c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_ING)) == "General") {
                            items.add(
                                Becas(
                                    c.getInt(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_ID)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_ING)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_INSTITUCION)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_DESC)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_REQUISITOS)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_IMAGE)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_TIPO)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_URL))
                                )
                            )
                        }

                    }
                    f1=""
                    f2=""
                }else{
                        while( c.moveToNext() )  {
                            items.add(
                                Becas(
                                    c.getInt(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_ID)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_ING)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_INSTITUCION)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_DESC)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_REQUISITOS)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_IMAGE)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_TIPO)),
                                    c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_URL))
                                )
                            )
                        }
                    f1=""
                    f2=""
                }

            }
        }

        //Cerrar conexión
        db.close()
        return items
    }
}