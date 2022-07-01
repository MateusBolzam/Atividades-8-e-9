public class Main
{
    public static void main(String[] args)
    {
        RestaurantChain NecTronalds = new RestaurantChain();

        NecTronalds.createRestaurant("Biggs", "Brazil");
        NecTronalds.getRestaurant("Biggs", "Brazil").getMenu().addItem("X-Burger", "Mais pedido!", 15.99F);
        NecTronalds.getRestaurant("Biggs", "Brazil").getMenu().addItem("X-Salada", "Leve, simples e delicioso!", 13.99F);
        NecTronalds.getRestaurant("Biggs", "Brazil").getMenu().addItem("X-Bacon", "Melhor da casa!", 18.99F);

        NecTronalds.createRestaurant("Arnaldos", "Brazil");
        NecTronalds.getRestaurant("Arnaldos", "Brazil").getMenu().addItem("X-Burger", "Mais pedido!", 15.99F);
        NecTronalds.getRestaurant("Arnaldos", "Brazil").getMenu().addItem("X-Salada", "Leve, simples e delicioso!", 13.99F);
        NecTronalds.getRestaurant("Arnaldos", "Brazil").getMenu().addItem("X-Bacon", "Melhor da casa!", 18.99F);


        NecTronalds.printRestaurants(); // Printa todos restaurantes da rede NecTronalds
        NecTronalds.printRestaurantsFilterName("Biggs");    // Printa todos restaurantes com o nome "Biggs"
        NecTronalds.printRestaurantsFilterCountry("Brazil");   // Printa todos restaurantes no país "Brazil"
    }
}
