/*
-- $Header: /cvsroot/mvnforum/mvnforum/sql/upgrade/1_1_ga_to_1_3_ga/mvnForum_update_interbase_unicode_FSS.sql,v 1.3 2008/11/12 10:30:42 minhnn Exp $
-- $Author: minhnn $
-- $Revision: 1.3 $
-- $Date: 2008/11/12 10:30:42 $
--
-- This script is used to upgrade mvnForum from 1.1 GA or 1.2 GA to 1.3 GA
--
-- Database: Interbase/Firebird
*/


ALTER TABLE mvnforumMemberGroup ADD ExpireDate TIMESTAMP NOT NULL ;

UPDATE mvnforumMemberGroup SET ExpireDate = CreationDate ;