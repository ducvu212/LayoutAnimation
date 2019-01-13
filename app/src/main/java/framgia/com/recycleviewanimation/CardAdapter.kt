package framgia.com.recycleviewanimation

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

internal class CardAdapter : RecyclerView.Adapter<CardAdapter.ViewHolder>() {

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		val inflater = LayoutInflater.from(parent.context)
		return ViewHolder(inflater.inflate(R.layout.row_empty_card, parent, false))
	}

	override fun onBindViewHolder(holder: ViewHolder, position: Int) {}

	override fun getItemCount(): Int {
		return ITEM_COUNT
	}

	internal class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

	companion object {

		const val ITEM_COUNT = 64
	}

}
