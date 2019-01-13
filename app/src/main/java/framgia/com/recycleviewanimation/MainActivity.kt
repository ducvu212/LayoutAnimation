package framgia.com.recycleviewanimation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		setupRecyclerView()
		runLayoutAnimation(AnimationItem("Fall down", R.anim.layout_animation_fall_down))
	}

	private fun runLayoutAnimation(item: AnimationItem) {
		val controller = AnimationUtils.loadLayoutAnimation(this, item.resourceId)
		recycleView.layoutAnimation = controller
		recycleView.adapter!!.notifyDataSetChanged()
		recycleView.scheduleLayoutAnimation()
	}

	private fun setupRecyclerView() {
		val spacing = resources.getDimensionPixelOffset(R.dimen.default_spacing_small)
		recycleView.layoutManager = LinearLayoutManager(this)
		recycleView.adapter = CardAdapter()
		recycleView.addItemDecoration(ItemOffsetDecoration(spacing))
	}
}


