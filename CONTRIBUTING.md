# How To Contribute To The Morganey IntelliJ Plugin

## Dependencies 

1. Local Clone Of This Repository

## Build Instructions From Within IDEA

1. IntelliJ 2016.X.X Community Stable With Kotlin and Scala Plugin
2. Install All Dependencies
3. Open This Project In IntelliJ 
4. Click The Run (Play) Button To Launch The Plugin In A Child IntelliJ Instance

## Build Instructions From Command Line

1. Install All Dependencies
2. cd to the root of the repository
3. run ./gradlew build 

## To Generate The JFlex Files

1. Intall the GrammarKit Plugin into IntelliJ
2. Right click on the `morganey.bnf` file in the resources directory
3. Click the following options in this order `Generate JFlex Lexer`, `Generate Parser Code` and `Generate Parser Util`
4. See Screenshot Below

![Imgur](http://i.imgur.com/zwdxuHj.png)