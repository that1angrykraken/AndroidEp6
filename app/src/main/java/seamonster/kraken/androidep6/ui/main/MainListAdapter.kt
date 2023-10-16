package seamonster.kraken.androidep6.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import seamonster.kraken.androidep6.data.User
import seamonster.kraken.androidep6.databinding.LayoutUserBinding

class MainListAdapter(var data: List<User> = ArrayList()) :
    RecyclerView.Adapter<MainListAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: LayoutUserBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User) {
            binding.user = user
            Glide.with(binding.root).load(user.picture.thumbnail).into(binding.imageUserPicture)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = LayoutUserBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = data[holder.adapterPosition]
        holder.bind(user)
    }
}