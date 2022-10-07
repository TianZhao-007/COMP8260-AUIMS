package com.example.myapplication.ui.gallery

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.SettingsActivity
import com.example.myapplication.SettingsActivity2
import com.example.myapplication.SettingsActivity3
import com.example.myapplication.databinding.FragmentGalleryBinding


class GalleryFragment : Fragment() {

  private var _binding: FragmentGalleryBinding? = null
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val galleryViewModel =
      ViewModelProvider(this).get(GalleryViewModel::class.java)

    _binding = FragmentGalleryBinding.inflate(inflater, container, false)
    binding.google.setOnClickListener{ v -> onClickGoogle(v)}
    binding.facebook.setOnClickListener{ v1 -> onClickFacebook(v1)}
    binding.TikTok.setOnClickListener{ v2 -> onClickGoogle(v2)}


    return binding.root

  }

  override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

  private fun onClickGoogle(view: View) {
    val intent = Intent(activity, SettingsActivity::class.java)
    startActivity(intent)
  }

  private fun onClickFacebook(view: View?) {
    val intent = Intent(activity, SettingsActivity2::class.java)
    startActivity(intent)
  }

  private fun onClickTikTok(view: View?) {
    val intent = Intent(activity, SettingsActivity3::class.java)
    startActivity(intent)
  }


}
