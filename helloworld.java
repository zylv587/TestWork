public static void main(String[] args) throws UIMAException, IOException {


    	ChemSpot tagger = ChemSpotFactory.createChemSpot(pathToDictionaryFile, pathToIDsFile, pathToEumedModel);
        String text = "Granulosa cells isolated from 22- or 25-day-old diethylstilbestrol-primed rats and cultured under" +
		" defined conditions for 48 h with NIH-FSH-S13 (ng/ml) or cholera toxin (0.1 microgram/ml) showed increased aromatase activity, " +
		"as determined by the release of 3H2O from [1 beta-3H]testosterone.";

		for (Mention mention : tagger.tag(text)) {
  System.out.printf("%d\t%d\t%s\t%s\t%s,\t%s%n",
    mention.getStart(), mention.getEnd(), mention.getText(),
    mention.getCHID(), mention.getSource(), mention.getType().toString());
}