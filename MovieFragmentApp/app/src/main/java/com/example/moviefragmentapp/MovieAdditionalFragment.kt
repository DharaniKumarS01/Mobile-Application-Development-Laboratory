package com.example.moviefragmentapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class MovieAdditionalFragment : Fragment() {

    private lateinit var etCast: EditText
    private lateinit var etDirector: EditText
    private lateinit var etMusic: EditText
    private lateinit var etProducer: EditText
    private lateinit var btnSaveAdditional: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movie_additional, container, false)

        etCast = view.findViewById(R.id.etCast)
        etDirector = view.findViewById(R.id.etDirector)
        etMusic = view.findViewById(R.id.etMusic)
        etProducer = view.findViewById(R.id.etProducer)
        btnSaveAdditional = view.findViewById(R.id.btnSaveAdditional)

        btnSaveAdditional.setOnClickListener {
            val data = """
                Cast: ${etCast.text}
                Director: ${etDirector.text}
                Music: ${etMusic.text}
                Producer: ${etProducer.text}
            """.trimIndent()

            Toast.makeText(requireContext(), "Saved:\n$data", Toast.LENGTH_LONG).show()
        }

        return view
    }
}