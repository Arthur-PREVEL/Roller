-- Initialisation des tables
INSERT INTO Country(id, code, name) VALUES
  (default, 'FR', 'France'), -- Les clés sont déclarées de façon auto-générées
  (default, 'UK', 'United Kingdom'),
  (default, 'US', 'United States of America'),
  (default, 'AL', 'Albanie');

-- Si on fixe les clés auto-générées, il faut réinitialiser le compteur
-- Attention, cette commande n'est pas standard SQL
-- ici la syntaxe pour H2
-- ALTER TABLE Country ALTER COLUMN id RESTART WITH 5;


-- Insertion des utilisateurs
INSERT INTO utilisateur (nom, prenom, email, est_master_administrateur, age, homme, niveau, categorie) VALUES
 ('Dupont', 'Jean', 'jean.dupont@email.com', false, 25, true, 'National1', 'Senior'),
 ('Martin', 'Sophie', 'sophie.martin@email.com', true, 30, false, 'Regional2', 'Junior'),
 ('Lemoine', 'Paul', 'paul.lemoine@email.com', false, 22, true, 'Novice3', 'Cadet');

-- Insertion des rôles des utilisateurs (les IDs doivent correspondre aux enregistrements auto-générés)
INSERT INTO utilisateur_roles (utilisateur_id, role) VALUES
 (1, 'Patineur'),
 (2, 'Administrateur'),
 (3, 'MembreDuBureau'),
 (3, 'Entraineur');
 
-- Insertion des compétitions
INSERT INTO competition (nom, date, lieu) VALUES
 ('Competition Paris 2024', '2024-06-15', 'Paris'),
 ('Competition Lyon 2024', '2024-07-20', 'Lyon');


-- Insertion des résultats (les IDs des compétitions et utilisateurs doivent être corrects)
INSERT INTO resultat (classement, competition_id, utilisateur_id) VALUES
  (1, 1, 1),
  (2, 1, 2),
  (3, 2, 3);

-- Réinitialisation des compteurs d'auto-incrémentation (selon la base de données utilisée)
-- Pour H2
ALTER TABLE utilisateur ALTER COLUMN id RESTART WITH (SELECT MAX(id) + 1 FROM utilisateur);
ALTER TABLE competition ALTER COLUMN id RESTART WITH (SELECT MAX(id) + 1 FROM competition);
ALTER TABLE resultat ALTER COLUMN id RESTART WITH (SELECT MAX(id) + 1 FROM resultat);