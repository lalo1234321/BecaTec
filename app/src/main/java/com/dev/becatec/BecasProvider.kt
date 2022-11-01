package com.dev.becatec

import com.dev.becatec.Becas

class BecasProvider {
    companion object{
        val becaList = arrayListOf<Becas>(
            Becas(
                1,
                "Santander",
                "Beca Manutencion",
                "https://www.santander.com/content/dam/santander-com/images/image-resources/san-logo.png",
                "active",
                "www.santander.com"
            ),
            Becas(
                1,
                "Santander",
                "Beca Manutencion",
                "https://brandemia.org/contenido/subidas/2019/04/logo-bbva-960x640.jpg",
                "active",
                "www.BBVA.com"
            ),
            Becas(
                1,
                "Santander",
                "Beca Manutencion",
                "https://rinacional.tecnm.mx/retrieve/c0721389-bb57-49fd-ad75-9be56bbed922",
                "active",
                "www.ITTol.com"
            ),
            Becas(
                1,
                "Santander",
                "Beca Manutencion",
                "data:image/jpeg;base64,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",
                "active",
                "www.toterreno.com"
            ),
            Becas(
                1,
                "Santander",
                "Beca Manutencion",
                "https://www.santander.com/content/dam/santander-com/images/image-resources/san-logo.png",
                "active",
                "www.santander.com"
            ),
            Becas(
                1,
                "Santander",
                "Beca Manutencion",
                "https://www.santander.com/content/dam/santander-com/images/image-resources/san-logo.png",
                "active",
                "www.santander.com"
            ),
            Becas(
                1,
                "Santander",
                "Beca Manutencion",
                "https://www.santander.com/content/dam/santander-com/images/image-resources/san-logo.png",
                "active",
                "www.santander.com"
            ),
            Becas(
                1,
                "Santander",
                "Beca Manutencion",
                "https://www.santander.com/content/dam/santander-com/images/image-resources/san-logo.png",
                "active",
                "www.santander.com"
            ),
            Becas(
                1,
                "Santander",
                "Beca Manutencion",
                "https://www.santander.com/content/dam/santander-com/images/image-resources/san-logo.png",
                "active",
                "www.santander.com"
            ),
            Becas(
                1,
                "Santander",
                "Beca Manutencion",
                "https://www.santander.com/content/dam/santander-com/images/image-resources/san-logo.png",
                "active",
                "www.santander.com"
            ),
            Becas(
                1,
                "Santander",
                "Beca Manutencion",
                "https://www.santander.com/content/dam/santander-com/images/image-resources/san-logo.png",
                "active",
                "www.santander.com"
            ),
            Becas(
                1,
                "Santander",
                "Beca Manutencion",
                "https://www.santander.com/content/dam/santander-com/images/image-resources/san-logo.png",
                "active",
                "www.santander.com"
            ),
            Becas(
                1,
                "Santander",
                "Beca Manutencion",
                "https://www.santander.com/content/dam/santander-com/images/image-resources/san-logo.png",
                "active",
                "www.santander.com"
            ),
            Becas(
                1,
                "Santander",
                "Beca Manutencion",
                "https://www.santander.com/content/dam/santander-com/images/image-resources/san-logo.png",
                "active",
                "www.santander.com"
            )

        )
        //Becas(id=1, institucion=Santander, desc=Beca Manutencion, image=https://www.santander.com/content/dam/santander-com/images/image-resources/san-logo.png, status=active, url=www.santander.com)
    }
}