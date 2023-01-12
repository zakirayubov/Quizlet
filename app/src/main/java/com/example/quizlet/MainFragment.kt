package com.example.quizlet

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quizlet.adapter.CourseAdapter
import com.example.quizlet.model.Course

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        setCourseRecycler(view)
        levelChange(view)

        val levelView: TextView = view.findViewById(R.id.levelTextView)
        levelView.text = activity?.intent?.getStringExtra("levelNum") ?: "Level 1"

        return view
    }

    private fun levelChange(view: View) {
        val levelTextView: TextView = view.findViewById(R.id.levelTextView)
        levelTextView.setOnClickListener(View.OnClickListener {
            val intent = Intent(activity, LevelActivity::class.java)
            startActivity(intent)
        })
    }


    private fun setCourseRecycler(view: View) {
        val courseRecycler: RecyclerView = view.findViewById(R.id.courseRecycler)

        courseRecycler.layoutManager =
            LinearLayoutManager(activity, RecyclerView.VERTICAL, false)

        val courseList: MutableList<Course> = mutableListOf()
        courseList.add(Course(1, "food", "Food", "2/3"))
        courseList.add(Course(2, "animals", "Animals", "3/5"))
        courseList.add(Course(3, "conversation", "Conversation", "3/3"))
        courseList.add(Course(4, "colors", "Colors", "7/7"))

        courseRecycler.adapter = CourseAdapter(requireContext(), courseList)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}