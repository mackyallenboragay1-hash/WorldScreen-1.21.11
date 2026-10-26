# WorldScreen (Minecraft Java 1.21.11)

WorldScreen is a new Fabric mod project aiming to provide a Holoscreen-like in-world browser screen.

## Current status

This is the **starter project**, not the finished browser mod yet. It builds the Fabric mod foundation and includes a GitHub Actions workflow that produces JAR artifacts. Browser rendering, placeable screens, and multiplayer synchronization still need to be implemented and tested.

## Requirements

- Minecraft Java Edition 1.21.11
- Fabric Loader for 1.21.11
- Java 21 for building
- Fabric API for 1.21.11

## Build on GitHub

After uploading these files to your repository:
1. Open the repository's **Actions** tab.
2. Select **Build WorldScreen**.
3. Click **Run workflow** (or wait for the first push build to finish).
4. Open the completed workflow run and download the **WorldScreen-1.21.11** artifact.
5. Extract the downloaded artifact ZIP to get the mod JAR.

## Install

Put the built `worldscreen-0.1.0.jar` in your Minecraft `mods` folder along with Fabric API. This starter only verifies that the mod loads; it does not yet show a browser screen.

## Planned features

- Placeable screen block/entity
- URL entry and browser surface
- Compatible embedded browser engine
- Server-authoritative screen state and multiplayer synchronization

## Development notes

The embedded browser engine needs to be selected and integrated against a version that explicitly supports Minecraft 1.21.11. Do not assume a browser dependency works just because the mod compiles.
