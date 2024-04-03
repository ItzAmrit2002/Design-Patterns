package AdapterPattern;

public class FancyUIServiceAdapter implements MultiRestoApp{
    public final FancyUIService fancyUIService;

    public FancyUIServiceAdapter(FancyUIService fancyUIService) {
        this.fancyUIService = fancyUIService;
    }

    @Override
    public void displayMenu(XmlData xmlData) {
        JSONData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayMenu(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JSONData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayRecommendations(jsonData);
    }

    private JSONData convertXmlToJson(XmlData xmlData) {
        //Convert XML to JSON
        return new JSONData();
    }

}
