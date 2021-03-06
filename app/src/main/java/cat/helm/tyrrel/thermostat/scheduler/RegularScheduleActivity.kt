package cat.helm.tyrrel.thermostat.scheduler

import android.os.Bundle
import android.support.design.widget.Snackbar
import cat.helm.tyrrel.R
import kotlinx.android.synthetic.main.activity_regular_schedule.*

class RegularScheduleActivity : ScheduleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regular_schedule)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

}
