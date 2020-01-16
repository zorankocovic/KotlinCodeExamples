package mobile.jetpackrecycleview.model.adapter

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import mobile.jetpackrecycleview.R
import mobile.jetpackrecycleview.model.DataModel

class SectionAdapter (private var dataList: List<DataModel>) : RecyclerView.Adapter<SectionAdapter.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //  holder?.txtTitle?.text = userList[position].title
        // holder?.txtContent?.text = userList[position].content
        val dataModel=dataList.get(position)

        holder?.txtTitle?.text =dataModel.name
        holder?.txtContent?.text=dataModel.eEmployeeCodeNumber

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        // return userList.size
        return dataList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        val txtContent = itemView.findViewById<TextView>(R.id.tvContent)
    }
}