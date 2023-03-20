-- farm data
INSERT INTO farmbo (id, name, user_id) values ('283a4fd5-b920-4068-95ad-da9a957bd89b', 'First Farm', 'Test User');
INSERT INTO farmbo (id, name, user_id) values ('426a4097-3b1b-46fe-8de4-49099c5c5a6c', 'Second Farm', 'Test User');
-- unit data
INSERT INTO unitbo (id, name, farm_id) values ('97ff177c-b965-40f6-bafa-d92d8d81eb0d', 'Small unit for First Farm', '283a4fd5-b920-4068-95ad-da9a957bd89b');
INSERT INTO unitbo (id, name, farm_id) values ('a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26', 'Medium unit for First Farm', '283a4fd5-b920-4068-95ad-da9a957bd89b');
INSERT INTO unitbo (id, name, farm_id) values ('8b9493c1-f795-4aed-ace3-ee8f92d72d39', 'Small unit for Second Farm', '426a4097-3b1b-46fe-8de4-49099c5c5a6c');

-- sensor data
-- AIR_HUMIDITY
-- Small unit for First Farm
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('2317ff7c-0822-4c47-bdcd-fb1b3ea797b7', '58cbf8c5-109f-4bbc-8db8-7acc35670e66', 'AIR_HUMIDITY', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('4604fb1e-9d7d-478e-a294-fa4a0651d14a', '6a084834-68a2-43ec-8e3f-289c06693b45', 'AIR_HUMIDITY', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('dec267cb-8912-4ccc-814b-f4054847fd56', '8f0fcca2-cafe-4b11-b9cc-12a42aa9b62b', 'AIR_HUMIDITY', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('e9ca698a-3485-49d3-a59c-487ea4460bd2', 'e070a31c-4359-4490-a1a5-2e8d9a19b517', 'AIR_HUMIDITY', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('409be851-ad7a-474e-aecc-7dda50710dab', 'da81ca2a-8f19-4b33-bce4-01ecf79f4831', 'AIR_HUMIDITY', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
-- Medium unit for First Farm
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('26ea3c8b-755b-4f08-9ffc-353014c1b9f9', '0494b5ed-c739-48dc-8c75-f609bad88987', 'AIR_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('8bf098d2-b597-4845-962f-0ad05b92233e', '33abb2d9-66ad-4f73-9964-f5ee3a5d0c7a', 'AIR_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('6947fc20-94e1-4f45-96ed-8e17861fe097', '526ed1bb-f3b8-4584-886c-f2fbf29ac75d', 'AIR_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('5e78a11d-62df-4d5e-90af-8c42ecefb947', 'ccd58d4d-b93a-4648-ac18-68e6ef57fe98', 'AIR_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('773fece7-e11e-45ab-8dad-55bb17996b9d', 'c6ee7946-caa4-4a77-a72e-c59ab935707b', 'AIR_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('64574212-2013-4225-a41a-62657943dc9f', '2810fd63-70d6-4f65-af42-f9500ad53257', 'AIR_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('3f9cda3d-3dc7-4432-b884-b6ac83fa5da6', 'c139b36b-0149-42a7-bf84-95bacc4b1eb4', 'AIR_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('ec945847-6d32-45d1-9f2d-1df319d1a0f6', '812f69e2-e95a-45e6-a994-104b231d4c3b', 'AIR_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('1cf3c57a-a1ff-4b48-83d2-45e95115b3ba', '643c37e9-6a03-4924-8e63-66d2b47ae930', 'AIR_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('146ffc7a-f795-48b2-8fae-2a5f67dd51e8', '4e4bd71d-1efd-415c-8397-d0520ae5a540', 'AIR_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
-- Small unit for Second Farm
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('c36646de-5fe1-4f2e-8066-a20b12ad17a9', '1cc099ae-45fa-4949-b01b-623b49be93e5', 'AIR_HUMIDITY', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('11951854-dd1e-47d5-9768-fb51bef71387', '6b247f6d-92e1-4e55-919d-06df4a1eba81', 'AIR_HUMIDITY', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('e2b1763b-8885-4292-a552-6210975190fe', 'cf46b58f-8d59-47b0-91f8-d54a716fd938', 'AIR_HUMIDITY', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('6d92437b-ca15-48ec-9c50-6c43e48117a2', '485dfc51-59d5-4b4f-b260-a3a9c8612ada', 'AIR_HUMIDITY', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('effd448c-9628-43a9-b155-d0f82a6329de', '8f48dee3-1b30-4598-af6a-92f8b700f166', 'AIR_HUMIDITY', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
-- LIGHT
-- Small unit for First Farm
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('7ebd9560-4f43-47dc-a62c-73063da6ab18', '08f757d8-0777-441e-bf63-027b24de6b52', 'LIGHT', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('f9dffc2f-cf77-41c5-a177-db483e7b0ebe', '787bbbab-3c08-423d-9d18-7a54604a127f', 'LIGHT', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('bbb532d1-1765-40ee-85c3-3f73db827f2c', 'd8cfd329-d6af-4f50-bb6d-8c73115b7bf1', 'LIGHT', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('d9588ab1-0c58-48af-90aa-49c82504c180', 'c2d95f8a-5404-4f0b-9e16-2d34e60ca5fa', 'LIGHT', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('72c9fe72-0f39-4efb-b593-01bc106bdd0c', '0f1d27ec-90b5-49f5-88ab-d11ee451bf9d', 'LIGHT', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
-- Medium unit for First Farm
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('a5eaeca3-cad0-47d2-b8c4-82d719896fbb', 'e66f7773-c3d7-4041-8ea3-b3c2e083f8b9', 'LIGHT', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('660b9977-64a2-4bac-961c-c599db51131d', 'e740a818-cedf-4961-8c24-f361a18a6e15', 'LIGHT', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('b3a1f38f-080b-40a6-8ba6-fb87346a35b3', '82d6da02-6d1c-4c92-975e-6a2e7d97f520', 'LIGHT', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('fbc119b1-3252-4d87-a802-1ecc206ef477', '4eab9c87-2d4c-4e53-a5a5-5a5af932d5e5', 'LIGHT', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('b4e3526b-fc80-4dab-b673-c70794cfd18b', '7a69c50f-9497-4623-b74e-2d2b259064cb', 'LIGHT', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('123fe224-6d1c-40b8-94dd-33044ffd5b11', 'd38417c9-ec1a-482e-9d19-3a3c0e258787', 'LIGHT', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('122bbacd-a1f1-4128-bc51-172b931e4be6', 'c7b08db4-4a4f-4c9d-9b47-69af5e5e5a5c', 'LIGHT', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('e8829a26-84be-419d-b2bc-7edf3704ee11', '78e27b67-d4e2-4be4-93ce-4e749ed4b7f8', 'LIGHT', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('5cea4429-1ebe-46b5-823c-1b5ff3527667', '3c9a4496-08d6-42e6-a14c-2c64a53a90e7', 'LIGHT', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('dfbdfc49-6481-4f98-bb77-57643b0ad31e', '152e3b3c-24d3-4e1f-8d6c-d2f090a1a76a', 'LIGHT', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
-- Small unit for Second Farm
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('a2d7c1b2-6b6f-47e5-86fc-02f50e1aafc3', '8f998c9f-b879-4a4c-8be4-0d56971efb90', 'LIGHT', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('10753324-026a-46f1-98cf-2f44ef0a3f0e', '67c6208a-0cde-4bb9-9b51-c8b0edc7d7f2', 'LIGHT', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('8735c1f3-56b1-4fa3-b493-cedae85ab06c', 'ff2c8e99-5f2c-40d1-b312-c7a8e09d3ab7', 'LIGHT', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('5c5c2251-fa08-4183-bda2-9f1eb689ec36', '14a13c7c-0353-426d-9fb3-6a18319bde32', 'LIGHT', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('032cc570-25e0-4425-98f3-5bf1b7ff858a', 'eeda6c16-6b94-4160-81d4-76128fb9f4b4', 'LIGHT', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
-- SOIL_PH
-- Small unit for First Farm
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('9a8e38f2-5198-4184-aea9-9888087c4c6d', 'ee3911ce-d85d-49c3-aa53-1d5fe42f3e5d', 'SOIL_PH', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('0dca9683-404d-445a-bdf2-004cdf2f1bfb', 'a50ea974-3847-4872-8acc-e71d03b14975', 'SOIL_PH', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('5606934c-31d7-4623-a595-7f84f1cccaa3', '82273fbe-c8c9-4e24-a06a-a6f708f982c7', 'SOIL_PH', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('7a383ada-6719-40ea-8c85-233c0fc24be4', '7c3b9824-fdfa-43d3-8a7a-61c3d90afc6a', 'SOIL_PH', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('9efa65a4-ef46-464a-8ef6-5af8ff92d6ab', '5a5b8501-7c76-490c-9a0c-a2cbded228f5', 'SOIL_PH', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
-- Medium unit for First Farm
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('60a3c79b-b025-452a-a4ac-1c413c389809', '66157076-3a44-4ceb-8233-5032cbf5abc0', 'SOIL_PH', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('17c67363-36e2-4634-8486-e09a78f53917', '37ce8eca-09d2-4920-8b69-925a0fd0364e', 'SOIL_PH', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('e050b9cf-31df-4139-92d7-896c2ed11ac2', 'abb4ea89-f2f2-4572-a736-13aaccabae6f', 'SOIL_PH', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('3620712b-1801-43d5-b470-dfa814162d42', '382564d6-61df-406c-a15e-d13cdcb07a5d', 'SOIL_PH', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('3bc94fe6-6075-4c70-a3be-c1d96f91a2f7', '0aa6c784-6387-4bfe-8efa-4b416b947a84', 'SOIL_PH', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('c8690c30-ce4b-42eb-95ef-6e6021dd810c', 'cb88f2f4-04c4-4104-8913-f8c267393152', 'SOIL_PH', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('00c32b31-5ef6-4269-a7e1-716fb0ad3bad', '3068be43-9237-4846-ab19-027c245e32e8', 'SOIL_PH', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('c97f4e26-f54c-4b3e-bcea-b1721d1cabb1', 'd832155f-a835-46d9-bbec-1779b4e0b7ed', 'SOIL_PH', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('68a45e0c-d983-4ece-ba3c-2ec89f810f8a', '2825a7b7-558e-4b0b-9c2f-79abc3170c86', 'SOIL_PH', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('6f70f7de-750f-4c6c-a5ae-359831c2f012', 'c4061707-5e84-4d2d-b8c5-c7e4a6f0e6e2', 'SOIL_PH', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
-- Small unit for Second Farm
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('9be4aaf4-cc77-4690-a98a-6901df2ee138', '94911751-d4e5-4849-b1e6-f4638d87a402', 'SOIL_PH', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('4f193220-1961-4f74-9cc7-d30b74d63279', '04f9c780-99d9-498e-9c17-ff7f02a75258', 'SOIL_PH', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('9c49b9e2-348a-48ea-8b58-8950226d5335', 'f8acabb6-647c-4d18-9ff2-d8170c04dadb', 'SOIL_PH', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('b073e93c-b0d1-4678-8d79-469d01c7ad9d', 'd622ed9f-b8eb-49a9-969b-5bdd0b4490b3', 'SOIL_PH', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('dd7cb58a-4baf-481b-b982-e21f53c20ccf', 'f39931a9-c7af-498f-97e8-b2a913914315', 'SOIL_PH', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
-- SOIL_HUMIDITY
-- Small unit for First Farm
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('a4240f66-c10e-4563-a910-b425024cb361', '7ea927c4-3560-4f26-8e79-a9450e3d0352', 'SOIL_HUMIDITY', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('0373929e-9cb0-42b6-a817-34c87186f155', 'bd624321-c73d-474c-a39c-355b307f0d90', 'SOIL_HUMIDITY', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('7282ef6e-c5a0-4ec0-861d-107e003d6e5e', '32c115a3-c8dd-4de2-8c3c-8caef10a2a11', 'SOIL_HUMIDITY', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('804d20a4-eacc-4778-8c6b-1ce62e81dcbf', '928fcef4-1fb0-48f7-b548-34173fd02b06', 'SOIL_HUMIDITY', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('2ce8eb4b-eee3-4cfc-85bf-cd0b395ed5f7', 'ee4f0c7c-6bd6-44b0-9119-0d5e2d6007dd', 'SOIL_HUMIDITY', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
-- Medium unit for First Farm
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('e3e22ca5-07d0-4665-beba-dcfa0d2ad515', '7d5166a3-c021-41a0-a2a0-9787d9220d89', 'SOIL_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('11cd6a00-9067-44f7-8ac1-02af979868df', '83f2874b-1579-42e9-9e9e-f8e6cc1d5141', 'SOIL_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('52ca1e09-b3dc-4930-adb4-7a6979ac70a4', '5ef53138-f768-449a-bd55-989a3702d9c1', 'SOIL_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('e8ff9719-8ab7-43ff-b365-f23dc4def17f', '0a4f6541-fdf1-4165-acc1-47e7e3352026', 'SOIL_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('9beab041-06e1-414a-b62c-d6b64d513a9a', 'd6f11651-f3b9-46c4-98b5-25ea35afc87e', 'SOIL_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('667337c8-b628-42b7-a87a-1d674884e2ed', '51a00d5b-2b25-4447-8a83-27488c2eebb9', 'SOIL_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('95883cc7-eb20-4bd6-afbc-b45a8c4bf53c', 'c98c4545-c974-46f8-abd4-4ca2e9436596', 'SOIL_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('c724c7b5-ecf0-4de5-8604-424612af1735', '1e7d0746-cc72-49ee-a459-43b10f30fffe', 'SOIL_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('de0e5598-cd42-45a9-8b3d-be45f0543038', 'c4805cf0-8a88-4bfa-b25f-2e4ce6e19f97', 'SOIL_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('62f78651-da9e-4caf-9887-c42685510983', '5dcfd80d-678f-43c6-90c0-fffa18c05f73', 'SOIL_HUMIDITY', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
-- Small unit for Second Farm
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('9e7fb52c-b275-4143-8b47-cd6308e08f1b', '77b81d7e-2703-4835-80ce-2dd1991a0a97', 'SOIL_HUMIDITY', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('55395ae0-2979-4ace-b09a-1c013bcf85e8', '5a4a413f-4c65-4d50-9bb0-559b35dd2e24', 'SOIL_HUMIDITY', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('6d5bdb5b-daf5-43c8-a989-f1a53aea662a', 'a0f9d9e6-4561-4a3e-96d6-f6d54a048606', 'SOIL_HUMIDITY', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('65026608-bc45-4dec-8946-1f5799cdfbd5', 'cc84c4dc-c6bb-4eff-83fa-ade3ad33cc9d', 'SOIL_HUMIDITY', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('0fa6f8b8-2fcd-425e-8331-5588965f148e', '4e09ea13-0920-4868-a0ca-8e4b9834f43c', 'SOIL_HUMIDITY', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
-- TEMPERATURE
-- Small unit for First Farm
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('261806cc-846c-4495-861b-c9a43923db4a', '9884851c-03e7-42c8-bb94-5a5ab5e5af5a', 'TEMPERATURE', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('eb63f67b-5099-4b35-9260-0d080cdd872f', 'a5e5f5f5-5f5f-5f5f-a5a5-5a5a5a5a5a5a', 'TEMPERATURE', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('7d6efd95-0350-4060-b23d-84cbda62520c', '1e2d2d23-d27b-4a6e-91eb-9a24e8d68050', 'TEMPERATURE', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('5fae40b3-e05b-4441-bc02-87ec56f449a2', 'c423a421-4a14-4e98-becd-6c319dbba9f9', 'TEMPERATURE', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('4a6cb8d5-1f90-4fd3-b480-d58e858d7d87', '51b4492a-e01f-4b4f-8e3f-d9144c6dbf68', 'TEMPERATURE', '97ff177c-b965-40f6-bafa-d92d8d81eb0d');
-- Medium unit for First Farm
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('dc6a2235-c698-46bd-8a3d-2c2ec4911807', 'b29551d2-3812-4bb4-81f2-aa27bbafcffa', 'TEMPERATURE', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('b6bd3f5f-4d42-48cf-9382-99629261a157', '62ebdfeb-c9c6-4680-9de4-e90ce1ab22ea', 'TEMPERATURE', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('636f0e55-84e8-414d-bd1d-485cf5a176ed', 'da363b32-53c8-4242-a95c-8c07426c2611', 'TEMPERATURE', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('7fe89aa0-bb1d-47bb-b958-f7c47340e99f', '09b7ee1b-88fc-4222-b68e-3d1265a5a3a5', 'TEMPERATURE', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('e0e0143b-934e-47fd-a76d-f6524d662856', '32af42f9-b19d-47a7-a312-10526204e7d7', 'TEMPERATURE', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('fedf91d7-9b2d-4a34-992b-92bc4b1708b5', 'de5f5af5-5a5a-5a5a-b5b5-b5b5b5b5b5b5', 'TEMPERATURE', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('1f48fe2c-41b5-4f5f-bece-63015c9a4827', 'f559a08e-0d9b-4fb2-a527-1fbb42f6ad09', 'TEMPERATURE', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('b083420e-80d8-4995-a181-374d609771a8', 'a5a5a5a5-5f5f-5f5f-a5a5-a5a5a5a5a5a5', 'TEMPERATURE', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('8ef5171a-8154-426b-9ebe-cbd01b992107', 'a83d6f4c-7042-4c4e-92b8-789d98c2d0bf', 'TEMPERATURE', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('b6e885bc-a0db-49f8-9b43-d04589b5fb19', '59b5ad66-b0e0-4eeb-86db-1cb56f48e275', 'TEMPERATURE', 'a7f98a5e-09ef-44f9-8cc6-ad2229e9ef26');
-- Small unit for Second Farm
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('2833242d-0f22-4592-9106-6c36cd9154e2', '1d7c4181-3cb0-4d82-a4dd-1d1abf6a1534', 'TEMPERATURE', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('dc60e3e1-b1a5-4979-8a2f-84b1f1704b38', '8b5d243f-25c6-4da1-bbfb-a1445f79820b', 'TEMPERATURE', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('de62d827-ad97-4f46-a722-1e09029d1264', '41a44d14-9841-4db3-8878-28d7f9f40bad', 'TEMPERATURE', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('9f6c59bc-24ee-4efd-b04d-b2a4069a3d2c', '9803efd0-4889-4703-b80d-eb68d3a2dd3c', 'TEMPERATURE', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');
INSERT INTO sensorbo (id, physical_id, sensor_type, unit_id) values ('02dda90f-3930-47db-9698-4c58d252216c', 'b26cc9aa-0a95-4ea6-865d-742c0033a8e4', 'TEMPERATURE', '8b9493c1-f795-4aed-ace3-ee8f92d72d39');