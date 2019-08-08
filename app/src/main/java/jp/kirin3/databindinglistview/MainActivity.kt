package jp.kirin3.databindinglistview

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jp.kirin3.databindinglistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: MainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        // Bindingオブジェクトを生成する
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        // 色々紐付ける
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}
