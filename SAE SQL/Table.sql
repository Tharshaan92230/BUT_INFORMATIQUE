CREATE TABLE Etudiant (
    Etudiant_id serial primary key,
    Nom varchar(50),
    Prenom varchar(50)
);

CREATE TABLE Enseignant (
    Enseignant_id serial primary key,
    Nom varchar(50),
    Prenom varchar(50),
    Age integer,
    Salaire integer
);

CREATE TABLE Matiere (
    Enseignant_id integer,
    Matiere_id varchar(10) primary key, 
    Matiere varchar(50),
    foreign key (Enseignant_id)
    references Enseignant(Enseignant_id)
);

CREATE TABLE Controle (
    Controle_id serial primary key,
    Matiere_id varchar(10),
    Controle varchar(20),
    foreign key (Matiere_id)
    references Matiere( Matiere_id )
);

CREATE TABLE Note (
    Etudiant_id integer,
    Controle_id integer,
    Note decimal(4,2),
    primary key(Etudiant_id, Controle_id ),
    foreign key (Etudiant_id)
    references Etudiant( Etudiant_id ),
    foreign key (Controle_id)
    references Controle( Controle_id )
);

CREATE TABLE ResponsableDeMatiere (
    ResponsableDeMatiere_id serial primary key,
    Enseignant_id integer,
    Matiere_id varchar(10),
    foreign key (Enseignant_id)
    references Enseignant( Enseignant_id),
    foreign key (Matiere_id)
    references Matiere( Matiere_id )
    
);

CREATE TABLE Bilan (
    Bilan_id serial primary key,
    Etudiant_id integer, 
    Appreciation varchar(150),
    Note float,
    MoyenneDesMatieres float,
    foreign key (Etudiant_id)
    references Etudiant(Etudiant_id)
);

CREATE TABLE EmploiDuTemps(
    EmploiDuTemps integer primary key, 
    Enseignant_id int references Enseignant( Enseignant_id),
    Etudiant_id int references Etudiant( Etudiant_id),
    Jour varchar(15),
    Semaine int,
    Heure float
);
