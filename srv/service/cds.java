namespace org.starj.cds.demo;

using { org.starj.cds.demo as model } from '../db/schema';

service MainService @(path:'/main') {

    entity Countries as select from model.Countries {
    *
    } excluding { onu_code, geo_point };

    entity Populations as projection on model.Populations;

    action adjustPopulation(population_id: model.Populations:id, population: Integer);

};