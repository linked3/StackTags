# StackTags

StackTags lets you control item stack sizes using data packs. Place items into one of several tags to set their exact max stack size. Works on Fabric, Quilt, and Forge via Architectury.

## What it does
- Adds item tags that set exact max stack sizes: `stacktags:stackable_to_1`, `stacktags:stackable_to_2`, `stacktags:stackable_to_4`, `stacktags:stackable_to_8`, `stacktags:stackable_to_16`, `stacktags:stackable_to_32`, `stacktags:stackable_to_64`.
- If an item is present in multiple tags, the largest value wins.
- Values are clamped to 64.

## How to use
Add your items to the desired tag(s) via a data pack:

```
data/stacktags/tags/items/stackable_to_16.json
{
  "replace": false,
  "values": [
    "minecraft:lava_bucket",
    "minecraft:water_bucket"
  ]
}
```

Or replace the default behaviour of the mod to set up your custom max stack sizes:

```
data/stacktags/tags/items/stackable_to_16.json
{
  "replace": true,
  "values": [
    "minecraft:golden_apple",
    "minecraft:enchanted_golden_apple"
  ]
}
```

You can create similar files for `stackable_to_1`, `2`, `4`, `8`, `32`, and `64`.

## Compatibility
- Loader: Fabric, Quilt, Forge (Architectury)
- Minecraft: 1.20.1

## License
This project is licensed under the license specified in `LICENSE`.
