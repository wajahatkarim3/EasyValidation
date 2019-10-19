package com.wajahatkarim3.easyvalidation_demo.example1

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.wajahatkarim3.easyvalidation_demo.R
import kotlinx.android.synthetic.main.activity_verification_methods.*

class VerificationMethodShowcaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification_methods)

        val spinnerAdapter = ArrayAdapter<VerificationRuleSamples.Sample>(
                this,
                R.layout.spinner_item,
                R.id.spinner_item_text,
                VerificationRuleSamples.samples)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onNothingSelected(parent: AdapterView<*>?) = Unit

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val sample = spinnerAdapter.getItem(position)!!
                edit_text.setText(sample.sampleText)
            }

        }

        validate_button.setOnClickListener {
            edit_text.error = null
            (spinner.selectedItem as? VerificationRuleSamples.Sample)?.func?.invoke(edit_text)
        }

        spinner.adapter = spinnerAdapter
    }

    companion object {

        fun start(context: Context) {
            val intent = Intent(context, VerificationMethodShowcaseActivity::class.java)
            context.startActivity(intent)
        }
    }
}
