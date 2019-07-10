# 热搜界面实现
![a72409c4.png](:storage\290357dc-87a1-4964-a214-95d6805173b8\a72409c4.png)
最终顺利完成实验要求
## 心得与感想
- 需要运用Recycler控件，而在添加Recycler的包的时候需要注意版本，例如本次实验中android studio提示需要将28.0.0 的包替换为26.1.0
- Data中为我们需要的数据的数据结构
- DataFactory中存储详细数据
- 实现Recycler需要Adapter和Holder，需要在JAVA代码中关联三者
```Java
public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        ((DemoViewHolder) viewHolder).bind(mList.get(position));
        if(position<3) {
            ((DemoViewHolder) viewHolder).Yellow();
        }
```
该函数控制刷新
