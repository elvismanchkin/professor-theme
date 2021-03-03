# Professor Theme

![Build](https://github.com/austintraver/professor-theme/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/16230.svg)](https://plugins.jetbrains.com/plugin/16230)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/16230.svg)](https://plugins.jetbrains.com/plugin/16230)

## Template ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [x] Set the Plugin ID in the above README badges.
- [x] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html).
- [x] Click the <kbd>Watch</kbd> button on the top of the [IntelliJ Platform Plugin Template][template] to be notified about releases containing new features and fixes.

<!-- Plugin description -->
This Fancy IntelliJ Platform Plugin is going to be your implementation of the brilliant ideas that you have.

This specific section is a source for the [plugin.xml](/src/main/resources/META-INF/plugin.xml) file which will be extracted by the [Gradle](/build.gradle.kts) during the build process.

To keep everything working, do not remove `<!-- ... -->` sections. 
<!-- Plugin description end -->

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> >
  <kbd>Marketplace</kbd> > <kbd>Search for "professor-theme"</kbd> >
  <kbd>Install Plugin</kbd>
  
- Manually:

  Download the
  [latest release](https://github.com/austintraver/professor-theme/releases/latest)
  and install it manually using <kbd>Settings/Preferences</kbd> >
  <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from
  disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
