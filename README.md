Stork
=======

Mob controlling, spawner removing.

About
-----
We needed to remove spawners on our server, due to people taking advantage of them. We still wanted some sort of reward for finding them, so we decided to turn ours into diamond blocks. Spawners are replaced when mobs spawn from them, it doesn't scan each chunk load.

Since we removed spawners, we also needed a way to spawn blazes in the nether. We added hooks to spawn them at a specified interval with pigmen in the same location.

Config
------
Spawners:
- __enablereplacement__ - (__true__/false) Enables the replacement of spawners.
- __replacement__ - (itemId(__57__)) The item to replace the spawners with, use air to remove them.

Blazes:
- __enableblazes__ - (__true__/false) Enables the spawning system for blazes.
- __blazespawntype__ - (WorldType(__nether__)) Doesn't do anything at the moment.
- __blazeoccurence__ - (int(__20__)) Blazes should spawn every x (whatever you set here) pigmen.
- __blazecount__ - (int(__1__)) This many blazes will spawn per occurence.

