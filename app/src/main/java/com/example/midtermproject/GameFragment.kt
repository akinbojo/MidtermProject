package com.example.midtermproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
//import kotlinx.android.synthetic.main.fragment_game.*

class GameFragment : Fragment() {
    private lateinit var viewModel: GameViewModel
    private lateinit var editTextPlayerName: EditText
    private lateinit var imageButton: Button
    private lateinit var imageButton2: Button
    private lateinit var ans: EditText
    private lateinit var Ok: Button





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewModel = ViewModelProvider(this).get(GameViewModel::class.java)


        imageButton.setOnClickListener {
            // Handle '-' button click
            val currentNumber = ans.text.toString().toIntOrNull() ?: 0
            ans.setText((currentNumber - 1).toString())
        }

        imageButton2.setOnClickListener {
            // Handle '+' button click
            val currentNumber = ans.text.toString().toIntOrNull() ?: 0
            ans.setText((currentNumber + 1).toString())
        }

        Ok.setOnClickListener {
            val playerName = editTextPlayerName.text.toString()
            val guess = ans.text.toString().toIntOrNull()
            if (guess != null) {
                val result = viewModel.checkGuess(guess)
                // Display Toast with the result (higher or lower)
                // Sound alarm for a wrong guess
            }
        }
    }
}
