CREATE TABLE `trn_formation` (
  `form_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `form_name` varchar(45) COLLATE latin1_general_ci NOT NULL,
  `form_desc` varchar(45) COLLATE latin1_general_ci NOT NULL,
  PRIMARY KEY (`form_id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=52 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;


CREATE TABLE `trn_formation_person` (
  `form_id` int(10) unsigned NOT NULL,
  `person_id` int(10) unsigned NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

CREATE TABLE `trn_person` (
  `person_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) COLLATE latin1_general_ci NOT NULL,
  `last_name` varchar(45) COLLATE latin1_general_ci NOT NULL,
  `age` int(10) unsigned NOT NULL,
  PRIMARY KEY (`person_id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=31 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;