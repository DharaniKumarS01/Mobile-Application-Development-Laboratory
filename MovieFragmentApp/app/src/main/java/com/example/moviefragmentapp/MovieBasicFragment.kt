package com.example.moviefragmentapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class MovieBasicFragment : Fragment() {

    private lateinit var etMovieId: EditText
    private lateinit var etName: EditText
    private lateinit var etLanguage: EditText
    private lateinit var etYear: EditText
    private lateinit var etCategory: EditText
    private lateinit var etDuration: EditText
    private lateinit var etIMDB: EditText
    private lateinit var btnSaveBasic: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movie_basic, container, false)

        etMovieId = view.findViewById(R.id.etMovieId)
        etName = view.findViewById(R.id.etName)
        etLanguage = view.findViewById(R.id.etLanguage)
        etYear = view.findViewById(R.id.etYear)
        etCategory = view.findViewById(R.id.etCategory)
        etDuration = view.findViewById(R.id.etDuration)
        etIMDB = view.findViewById(R.id.etIMDB)
        btnSaveBasic = view.findViewById(R.id.btnSaveBasic)

        btnSaveBasic.setOnClickListener {
            val data = """
                Movie ID: ${etMovieId.text}
                Name: ${etName.text}
                Language: ${etLanguage.text}
                Year: ${etYear.text}
                Category: ${etCategory.text}
                Duration: ${etDuration.text}
                IMDB Ratings: ${etIMDB.text}
            """.trimIndent()

            Toast.makeText(requireContext(), "Saved:\n$data", Toast.LENGTH_LONG).show()
        }

        return view
    }
}