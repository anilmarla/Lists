import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.anil.myapplication.databinding.ListItemCryptoBinding
import com.anil.myapplication.lists.crypto.Crypto
import com.anil.myapplication.lists.crypto.CryptoDiffCallback
import com.anil.myapplication.lists.crypto.CryptoListAdapterListener
import com.bumptech.glide.Glide

class CryptoListAdapter(val listener: CryptoListAdapterListener) :
    ListAdapter<Crypto, CryptoListAdapter.CryptoViewHolder>(CryptoDiffCallback()) {
    inner class CryptoViewHolder(val binding: ListItemCryptoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(crypto: Crypto) {
            Glide.with(binding.root.context)
                .load(crypto.logo)
                .into(binding.smallcardLogo)

            binding.textTitle.text = crypto.title
            binding.textSubTittle.text = crypto.subtitle
            binding.textDate.text = crypto.date

            binding.bigCard.setOnClickListener {
                listener.onCardClicked(crypto)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoViewHolder {
        return CryptoViewHolder(
            ListItemCryptoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CryptoViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}