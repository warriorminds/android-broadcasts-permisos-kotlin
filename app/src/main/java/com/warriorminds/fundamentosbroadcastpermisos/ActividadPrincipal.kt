package com.warriorminds.fundamentosbroadcastpermisos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.actividad_principal.*

class ActividadPrincipal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_principal)

        botonEnviarBroadcast.setOnClickListener {
            val intent = Intent("com.warriorminds.broadcast.ACCION_PERMISOS")
            sendBroadcast(intent, "com.warriorminds.permisos.PERMISO_BROADCAST")
        }
    }
}
