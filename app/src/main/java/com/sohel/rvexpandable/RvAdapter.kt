package com.sohel.rvexpandable

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.sohel.rvexpandable.databinding.SingleItemBinding

class RvAdapter( val languageList: List<Languages>): RecyclerView.Adapter<RvAdapter.RvViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        val binding = SingleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RvViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        with(holder){
            with(languageList[position]){

                // set name of the language from the list
                binding.tvLanguageName.text = this.name

                // set description to the text
                // since this is inside "ExpandedView" its visibility will be gone initially
                // which will also make the visibility of desc also available
                binding.txtDescription.text = this.description

                // check if boolean property "extend" is true or false
                // if it is true make the "extendedView" Visible
                binding.rvExpandable.visibility = if (this.expand) View.VISIBLE else View.GONE

                // on Click of the item take parent card view in our case
                // revert the boolean "expand"
                binding.imgArrow.setOnClickListener {
                    this.expand = !this.expand
                    notifyDataSetChanged()
                }
            }
        }
    }

    override fun getItemCount(): Int {
       return languageList.size
    }

   inner class RvViewHolder(val binding: SingleItemBinding): RecyclerView.ViewHolder(binding.root){

    }

}