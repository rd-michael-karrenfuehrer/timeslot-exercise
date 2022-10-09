# Feature: Time Slot Search Endpoint

## Aufgabe
- Wir möchten Endpunkte fuers Anlegen, Aendern und Loeschen von Lieferslots haben
- Wir möchten einen Endpunkt für Lieferslots haben, in dem man nach
  verschiedenen Kriterien filtern kann
- Die Endpunkte sollen API-Endpunkte sein, welche JSON verarbeiten (keine UI / Template)

Lieferslot-Modell:
  - date
  - start time
  - end time
  - market id
  - zip code

## Implementation Details
- Ausbaustufen:
  - Liste aller Slots
  - Einen Slot by ID
  - Filterung der Slots nach Datum
  - Filterung der Slots nach Uhrzeit
  - Filterung der Slots nach Slot-Laenge
  - Filterung der Slots nach PLZ
  - Ermöglichen von Wildcard-PLZ?
  - Filterung der Slots nach market id
  - Validierung "start time before end time" beim Anlagen/Anpassen von einem Lieferslot (bei invalidem Format oder Endzeit vor Startzeit → Bad Request)