package com.example.quizlet.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.quizlet.R
import com.example.quizlet.model.Course

class CourseAdapter(var context: Context, var courses: MutableList<Course>) :
    RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val courseItems: View =
            LayoutInflater.from(context).inflate(R.layout.course_item, parent, false)
        return CourseViewHolder(courseItems)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val imageId: Int = context.resources.getIdentifier(
            "ic_" + courses[position].img,
            "drawable",
            context.packageName
        )

        holder.courseImage.setImageResource(imageId)
        holder.courseTitle.text = courses[position].title
        holder.courseLevel.text = courses[position].level
    }

    override fun getItemCount(): Int {
        return courses.size
    }

    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var courseImage: ImageView = itemView.findViewById(R.id.courseImage)
        var courseTitle: TextView = itemView.findViewById(R.id.courseTitle)
        var courseLevel: TextView = itemView.findViewById(R.id.courseLevel)
    }
}