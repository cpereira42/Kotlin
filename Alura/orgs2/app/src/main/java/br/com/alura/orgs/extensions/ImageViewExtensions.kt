package br.com.alura.orgs.extensions

import android.widget.ImageView
import br.com.alura.orgs.R
import coil.load

fun ImageView.tentaCarregarImagem(url: String? = null){
    load(url){
        fallback(R.drawable.imagem_padrao) // imagem nula
        error(R.drawable.imagem_padrao) // imagem não encontrada
        placeholder(R.drawable.placeholder)
    }
}