package com.mines_csci448.editCharacter

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.mines_csci448.databinding.FragmentEditCharacterBinding
private const val LOG_TAG = "EditCharacterFragment"
class EditCharacterFragment : Fragment(){
    private lateinit var upgradeCharacterButton: Button
    private var _binding: FragmentEditCharacterBinding? = null
    private val binding get() = _binding!!
    interface Callbacks{

        //Not yet implemented
    }
    override fun onAttach(context: Context) {
        Log.d(LOG_TAG, "onAttach() called" )
        super.onAttach(context)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(LOG_TAG, "onCreate() called")
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) :View? {
        Log.d(LOG_TAG, "onCreateView called")
        _binding = FragmentEditCharacterBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(LOG_TAG, "onViewCreated() called")
        super.onViewCreated(view, savedInstanceState)
    }
    override fun onDestroyView() {
        Log.d(LOG_TAG, "onDestroyView() called")
        super.onDestroyView()
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(LOG_TAG, "onActivityCreated() called")
        super.onActivityCreated(savedInstanceState)
    }
    override fun onStart() {
        Log.d(LOG_TAG, "onStart() called")
        super.onStart()
    }
}