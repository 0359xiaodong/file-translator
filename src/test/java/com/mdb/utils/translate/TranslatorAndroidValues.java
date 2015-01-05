package com.mdb.utils.translate;

import java.util.ArrayList;

public class TranslatorAndroidValues {

    public static final String GOOGLE_API_KEY = "AIzaSyBKLWxBb2nMr9bIb4-PRUkHH7Df8-fxmAw";

    @org.junit.Test
    public void testInit() throws Exception {

        String root = "/Users/mathieudebrito/IdeaProjects/file-translator/src/test/resources";

        Translator.Config config = new Translator.Config();
        config.key = GOOGLE_API_KEY;
        config.languageFrom = Language.ENGLISH;
        config.languageTo = Language.toList(Language.FRENCH);
        config.files = new ArrayList<FileToTranslate>();
        config.files.add(new FileToTranslate(root, new FileParserAndroidStrings(), new FileGeneratorAndroidStrings()));

        Translator translator = new TranslatorGoogle();
        translator.init(config);

        translator.translate();
    }


}