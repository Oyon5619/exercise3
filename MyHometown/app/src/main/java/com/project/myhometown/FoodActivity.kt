package com.project.myhometown

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.myhometown.databinding.ActivityFoodBinding

class FoodActivity : AppCompatActivity() {
    private lateinit var afb: ActivityFoodBinding
    private val foods = ArrayList<Food>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        afb = ActivityFoodBinding.inflate(layoutInflater)
        setContentView(afb.root)

        // 初始化数据
        initFood()

        val lm = LinearLayoutManager(this)
        val fa = FoodAdapter(foods)


        afb.apply {
            foodBack.setOnClickListener {
                var intent = Intent(this@FoodActivity, MainActivity::class.java)
                startActivity(intent)
            }

            foodRecView.apply {
                layoutManager = lm
                adapter = fa
            }
        }

    }

    private fun initFood() {
        foods.apply {
            add(Food("金山火蒜"))
            add(Food("鹤山红烟"))
            add(Food("三桁瓦菜刀"))
            add(Food("荷塘冲菜"))
            add(Food("水口腐乳"))
            add(Food("江门排粉"))
            add(Food("外海花生饼"))
            add(Food("牛脚皮"))
            add(Food("恩平粘米角"))
            add(Food("古井烧鹅"))
            add(Food("江门凉粉"))
            add(Food("豆角糍"))
        }
    }
}