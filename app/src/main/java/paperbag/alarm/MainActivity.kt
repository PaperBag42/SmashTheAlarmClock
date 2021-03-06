package paperbag.alarm

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		setSupportActionBar(toolbar)
		
		// set up recyclerview
		recyclerview_main.layoutManager = LinearLayoutManager(this)
		recyclerview_main.adapter = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
			override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
				TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
			}
			
			override fun getItemCount() = 1 // TODO: Make multiple clocks
			
			override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
				TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
			}
			
		}
		
		
		// TODO: add clock button
		fab_main_addclock.setOnClickListener { view ->
			Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
					.setAction("Action", null).show()
		}
	}
	
	override fun onCreateOptionsMenu(menu: Menu): Boolean {
		// Inflate the menu; this adds items to the action bar if it is present.
		menuInflater.inflate(R.menu.menu_main, menu)
		return true
	}
	
	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		return if (item.itemId == R.id.action_menu_setringtone) {
			// I might take it further later
			Snackbar.make(
					coordinatorlayout_main,
					"NOPE",
					Snackbar.LENGTH_LONG
			).show()
			true
		} else super.onOptionsItemSelected(item)
	}
}
