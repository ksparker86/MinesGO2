package com.mines_csci448.start

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mines_csci448.databinding.FragmentStartScreenBinding

class startScreen : Fragment(){
    private var _binding : FragmentStartScreenBinding? = null
    private val binding get() = _binding!!

    companion object {
        private const val LOG_TAG = "StartScreen"
    }
    override fun onAttach(context: Context) {
        Log.d(LOG_TAG, "onAttach called")
        super.onAttach(context)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(LOG_TAG, "onCreate called")
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(LOG_TAG, "onCreateView called")
        _binding = FragmentStartScreenBinding.inflate(inflater, container, false)
        //Setting OnClickListeners
        binding.startButton.setOnClickListener{ view: View ->
            Log.d(LOG_TAG, "Start Map Button Pessed")
            Toast.makeText(requireContext(), "Start Map Button Pressed", Toast.LENGTH_SHORT).show()
        }
        binding.editCharacterButton.setOnClickListener{ view: View ->
            Log.d(LOG_TAG, "Edit Character Button Pressed")
            //Toast.makeText(requireContext(), "Edit Character Clicked.", Toast.LENGTH_SHORT).show()
            //TODO: Navigate to Edit Character Fragment
            val action = startScreenDirections.actionStartScreenToEditCharacterFragment3()
            findNavController().navigate(action)
        }
        binding.settingsButton.setOnClickListener{ view: View ->
            Log.d(LOG_TAG, "Settings Button Pressed")
            Toast.makeText(requireContext(), "Settings Button Pressed.", Toast.LENGTH_SHORT).show()
        }
        binding.exitButton.setOnClickListener{ view: View ->
            Log.d(LOG_TAG, "Exit Button Pressed")
            Toast.makeText(requireContext(), "Exit Button Pressed.", Toast.LENGTH_SHORT).show()
        }
        return binding.root}
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(LOG_TAG, "onViewCreated() called")
        super.onViewCreated(view, savedInstanceState)
    }
    override fun onStart() {
        Log.d(LOG_TAG, "onStart() called")
        super.onStart()
    }
    override fun onResume() {
        Log.d(LOG_TAG, "onResume() called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(LOG_TAG, "onPause() called")
        super.onPause()
    }

    override fun onStop() {
        Log.d(LOG_TAG, "onStop() called")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(LOG_TAG, "onDestroyView called")
        super.onDestroyView()
        _binding = null
    }

    override fun onDestroy() {
        Log.d(LOG_TAG, "onDestroy() called")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(LOG_TAG, "onDetach called")
        super.onDetach()
    }
}