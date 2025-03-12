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
