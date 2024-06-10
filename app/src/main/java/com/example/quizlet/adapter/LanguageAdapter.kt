package com.example.quizlet.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.quizlet.R
import com.example.quizlet.model.Language

class LanguageAdapter (var context: Context, var languages: MutableList<Language>) :
    RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val courseItems: View =
            LayoutInflater.from(context).inflate(R.layout.language_item, parent, false)
        return LanguageViewHolder(courseItems)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val imageId: Int = context.resources.getIdentifier(
            "ic_" + languages[position].img,
            "drawable",
            context.packageName
        )

        holder.languageImage.setImageResource(imageId)
        holder.languageTitle.text = languages[position].title
        holder.languageLevel.text = languages[position].level

    }

    override fun getItemCount(): Int {
        return languages.size
    }

    class LanguageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var languageImage: ImageView = itemView.findViewById(R.id.languageImage)
        var languageTitle: TextView = itemView.findViewById(R.id.languageTitle)
        var languageLevel: TextView = itemView.findViewById(R.id.languageLevel)
    }

}