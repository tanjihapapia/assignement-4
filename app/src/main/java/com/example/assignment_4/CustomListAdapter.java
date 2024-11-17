package com.example.assignment_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    private Context context;
    private List<Item> items; // List of Item objects
    private HashMap<Integer, Boolean> expandedMap; // To track expanded items

    public CustomListAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
        this.expandedMap = new HashMap<>();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);
        }

        TextView title = convertView.findViewById(R.id.title);
        TextView subtitle = convertView.findViewById(R.id.subtitle);
        TextView description = convertView.findViewById(R.id.description);
        View expandableContent = convertView.findViewById(R.id.expandable_content);
        ImageView leftIcon = convertView.findViewById(R.id.left_icon);
        ImageView rightArrow = convertView.findViewById(R.id.right_arrow);
        Button actionButton = convertView.findViewById(R.id.action_button);

        Item item = items.get(position);

        title.setText(item.getTitle());
        subtitle.setText(item.getSubtitle());
        description.setText(item.getDescription());

        // Set left image (example: placeholder image)
        leftIcon.setImageResource(R.drawable.ic_launcher_foreground); // Replace with your icon logic

        // Handle expand/collapse
        boolean isExpanded = expandedMap.getOrDefault(position, false);
        expandableContent.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

        // Toggle arrow image
        rightArrow.setImageResource(isExpanded ? R.drawable.ic_arrow_up : R.drawable.ic_arrow_down);

        convertView.setOnClickListener(v -> {
            expandedMap.put(position, !isExpanded);
            notifyDataSetChanged();
        });

        // Handle action button
        actionButton.setOnClickListener(v -> {
            // Action logic (e.g., show a Toast or perform an action)
        });

        return convertView;
    }

}
