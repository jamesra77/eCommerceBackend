package com.ecom.productcatalog.config;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.respository.CategoryRepository;
import com.ecom.productcatalog.respository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // clear all existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        // Create Categories

        Category pcGaming = new Category();
        pcGaming.setName("PC Gaming");

        Category outdoors = new Category();
        outdoors.setName("Outdoors");

        Category home = new Category();
        home.setName("Home");

        categoryRepository.saveAll(Arrays.asList(pcGaming, outdoors, home));

        // Create Products
        Product steamDeck = new Product();
        steamDeck.setName("Steam Deck OLED");
        steamDeck.setDescription("A high power gaming PC in your hands! From renowned game and hardware developer Valve");
        steamDeck.setImageUrl("https://placehold.co/500x400");
        steamDeck.setPrice(539.99);
        steamDeck.setCategory(pcGaming);

        Product cpu9800x3d = new Product();
        cpu9800x3d.setName("AMD 9800X3D CPU");
        cpu9800x3d.setDescription("The best gaming CPU on the market, now with even more 3D V-cache!");
        cpu9800x3d.setImageUrl("https://placehold.co/500x400");
        cpu9800x3d.setPrice(479.99);
        cpu9800x3d.setCategory(pcGaming);

        Product zowieFk2 = new Product();
        zowieFk2.setName("Zowie FK2 Gaming Mouse");
        zowieFk2.setDescription("Ambidextrous gaming mouse - Multiple DPI settings - wired - awesome mouse");
        zowieFk2.setImageUrl("https://placehold.co/500x400");
        zowieFk2.setPrice(47.99);
        zowieFk2.setCategory(pcGaming);

        Product hikingBoots = new Product();
        hikingBoots.setName("Hiking Boots");
        hikingBoots.setDescription("Great stompers for long treks");
        hikingBoots.setImageUrl("https://placehold.co/500x400");
        hikingBoots.setPrice(89.99);
        hikingBoots.setCategory(outdoors);

        Product coffeeTable = new Product();
        coffeeTable.setName("Coffee Table");
        coffeeTable.setDescription("Works as a table and coffee mug platform!");
        coffeeTable.setImageUrl("https://placehold.co/500x400");
        coffeeTable.setPrice(399.99);
        coffeeTable.setCategory(home);

        productRepository.saveAll(Arrays.asList(steamDeck, cpu9800x3d, zowieFk2, hikingBoots, coffeeTable));
    }
}
