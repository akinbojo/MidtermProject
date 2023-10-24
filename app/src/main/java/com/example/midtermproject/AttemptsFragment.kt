package com.example.midtermproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
//import kotlinx.android.synthetic.main.fragment_attempts.*

class AttemptsFragment : Fragment() {
    private lateinit var viewModel: GameViewModel
    private lateinit var attemptsText: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_attempts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(GameViewModel::class.java)

        // Observe changes to the number of attempts and update the TextView
        viewModel.attempts.observe(viewLifecycleOwner) { attempts ->
            attemptsText.text = "Attempts: $attempts"
        }
        //return view

    }
}
