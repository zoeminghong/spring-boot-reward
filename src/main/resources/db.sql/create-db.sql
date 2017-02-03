CREATE TABLE reward_share (
  `id` varchar(64) NOT NULL,
  `sharer` varchar(64) NOT NULL,
  `sceneId` varchar(64) NOT NULL,
  `count` int(11) NOT NULL DEFAULT '0',
  `shareDate` timestamp NOT NULL ,
  `createDate` timestamp NOT NULL ,
  `updateDate` timestamp NULL ,
  `version` bigint(255) NOT NULL DEFAULT '0',
  `isdeleted` tinyint(255) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
);