package com.example.assignment_4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);

        // Create a list of items with all titles, subtitles, and descriptions changed
        List<Item> items = new ArrayList<>();
        items.add(new Item("Inbox Manager", "Organize communications", "Manage your emails effectively with filters and tags.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Weather Updates", "Real-time forecasts", "Get accurate weather updates for your location.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Event Planner", "Stay on top", "Create schedules and reminders for important tasks.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Fitness Tracker", "Achieve your goals", "Monitor workouts, steps, and overall fitness progress.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Music Vault", "Unlimited melodies", "Access a library of curated playlists and songs.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Route Finder", "Navigate smarter", "Find the quickest routes and explore new destinations.", R.drawable.ic_launcher_foreground));
        items.add(new Item("News Reader", "Daily highlights", "Stay informed with breaking news and trends.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Shopping Cart", "Simplify purchases", "Add, remove, and organize items in your cart.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Gallery Organizer", "Picture perfect", "Categorize and secure your cherished memories.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Settings Hub", "Control preferences", "Adjust your app settings to suit your needs.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Contact Directory", "Stay connected", "Easily manage and update your contact list.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Note Keeper", "Capture thoughts", "Write, save, and share notes effortlessly.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Recipe Box", "Culinary inspiration", "Browse and save your favorite cooking recipes.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Library Manager", "Sort your books", "Organize your reading list and track your progress.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Cinema Hub", "Discover movies", "Explore trending movies and create your watchlist.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Travel Companion", "Plan journeys", "Organize trips and itineraries for stress-free travel.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Wellness Challenges", "Boost your health", "Join challenges and track your progress with friends.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Meditation Coach", "Find your calm", "Relax with guided meditation sessions and breathing exercises.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Budget Planner", "Financial control", "Track expenses and create monthly budgets.", R.drawable.ic_launcher_foreground));
        items.add(new Item("Support Desk", "We’re here to help", "Access FAQs or contact support for assistance.", R.drawable.ic_launcher_foreground));

        CustomListAdapter adapter = new CustomListAdapter(this, items);
        listView.setAdapter(adapter);
    }
}

