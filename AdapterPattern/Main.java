package AdapterPattern;

public class Main {
    XmlData xmlData = new XmlData();

    //Old UI
    MultiRestoApp app = new Zomato();
    app.displayMenu(xmlData);
    app.displayRecommendations(xmlData);


    //New UI, which internally requires JSONData but the client doesnt have to care about it. (This is the client code)
    MultiRestoApp adapter = new FancyUIServiceAdapter();
    adapter.displayMenu(xmlData);
    adapter.displayRecommendations(xmlData);
}
